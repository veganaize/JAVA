@ECHO OFF
@SETLOCAL ENABLEEXTENSIONS ENABLEDELAYEDEXPANSION


REM *TODO*:
REM     Add assets folder to apk
REM     Add libs folder to apk
REM     Incremental compile --altered files only-- to improve speed
REM     Migrate to PKCS12 keystore format? (or supress warning)
REM     Compile Kotlin
REM     Add a "clean" build task
REM     Check and tune java target api levels


SET API_LEVEL=14
SET BUILD_TYPE=debug
SET CMDLINE_TOOLS=8.0
SET DEFAULT_ACTIVITY=MainActivity


IF "%*"=="--help" (
    @ECHO.
    @ECHO Usage
    @ECHO -----
    @ECHO.
    @ECHO    buildapp [VARIABLE=value [VARIABLE=value ...]]
    @ECHO.
    @ECHO.
    @ECHO Variables
    @ECHO ---------
    @ECHO.
    @ECHO    ANDROID_HOME=^<root-path^>          - default: %ANDROID_HOME%
    @ECHO    API_LEVEL=^<api-level^>             - default: %API_LEVEL%
    @ECHO    BUILD_TYPE=^<debug^|release^|clean^>  - default: %BUILD_TYPE%
    @ECHO    CMDLINE_TOOLS=^<version^|latest^>    - default: %CMDLINE_TOOLS%
    @ECHO    DEFAULT_ACTIVITY=^<class^>          - default: %DEFAULT_ACTIVITY%
    @ECHO    PACKAGE_NAME=^<pkg-name^>           - default: auto-detect ^(slow^)
    @ECHO.
    @ECHO.
    @ECHO Folder Structure
    @ECHO ----------------
    @ECHO.
    @ECHO    src\       - java source code
    @ECHO    res\       - resources: layout; drawables; strings; styles; dimens
    @ECHO    gen\       - auto-generated R.java
    @ECHO    libs\      - .jar libraries
    @ECHO    assets\    - raw uncompiled assets
    @ECHO    compiled\  - compiled artifacts
    @ECHO.

    GOTO :EOF
)


@ECHO Processing parameters...
:ProcessParameters
IF NOT "%1"=="" (
    SET %1=%2
    @ECHO     %1=%2
    SHIFT
    SHIFT
    GOTO ProcessParameters
)


@ECHO Compiling resources...
mkdir compiled 2>NUL
aapt2 compile ^
    -o compiled\res.zip ^
    --dir res
IF NOT "%ERRORLEVEL%"=="0" GOTO :EOF


@ECHO Linking resources...
mkdir gen 2>NUL
aapt2 link ^
    compiled\res.zip ^
    -o compiled\unsigned.apk ^
    --manifest AndroidManifest.xml ^
    -I %ANDROID_HOME%\platforms\android-!API_LEVEL!\android.jar ^
    --java gen
IF NOT "%ERRORLEVEL%"=="0" GOTO :EOF



IF "!PACKAGE_NAME!"=="" (
    @ECHO Discovering package name...
    FOR /F %%r IN ('apkanalyzer manifest application-id compiled\unsigned.apk') DO (
        @ECHO     %%r
        SET PACKAGE_NAME=%%r
    )
) ELSE (
    @ECHO Using provided package name...
    @ECHO     !PACKAGE_NAME!
)


@REM Compile Kolin...?


@ECHO Compiling java...
javac ^
    -source 1.7 ^
    -target 1.7 ^
    -bootclasspath %ANDROID_HOME%\platforms\android-!API_LEVEL!\android.jar ^
    -cp gen ^
    -d compiled ^
    src\%PACKAGE_NAME:.=\%\*.java
IF NOT "%ERRORLEVEL%"=="0" GOTO :EOF


@ECHO Dexxing classes...
IF "%BUILD_TYPE%"=="release" (
    set DEBUG=
) ELSE (
    set DEBUG=--debug
)

java -cp %ANDROID_HOME%\cmdline-tools\!CMDLINE_TOOLS!\lib\r8.jar com.android.tools.r8.D8 ^
    %DEBUG% ^
    --min-api !API_LEVEL! ^
    --output compiled ^
    --lib %ANDROID_HOME%\platforms\android-!API_LEVEL!\android.jar ^
    compiled\%PACKAGE_NAME:.=\%\*.class
IF NOT "%ERRORLEVEL%"=="0" GOTO :EOF


@ECHO Adding dex to apk...
jar Muf compiled\unsigned.apk -C compiled classes.dex
IF NOT "%ERRORLEVEL%"=="0" GOTO :EOF


IF EXIST compiled\debug.keystore (
    @ECHO Utilizing existing debug key...
) ELSE (
    @ECHO Generating debug key...
    keytool -genkey ^
        -keystore compiled\debug.keystore ^
        -storepass android ^
        -alias androiddebugkey ^
        -keypass android ^
        -dname "CN=Android Debug, O=Android, C=US" ^
        -keyalg RSA ^
        -keysize 2048 ^
        -validity 10000
IF NOT "%ERRORLEVEL%"=="0" GOTO :EOF
)


@ECHO Signing apk with debug key...
call apksigner sign ^
    --ks compiled\debug.keystore ^
    --ks-pass pass:android ^
    --ks-key-alias androiddebugkey ^
    --out compiled\signed.apk ^
    compiled\unsigned.apk
IF NOT "%ERRORLEVEL%"=="0" GOTO :EOF


IF "%BUILD_TYPE%"=="release" (
    @ECHO Verifying apk signature...
    call apksigner verify ^
        --min-sdk-version !API_LEVEL! ^
        compiled\signed.apk
    IF NOT "%ERRORLEVEL%"=="0" GOTO :EOF
)


IF "%BUILD_TYPE%"=="release" (
    @ECHO Recompressing apk with zopfli and aligning...
    zipalign -zpf 4 compiled\signed.apk compiled\release.apk
) ELSE (
    @ECHO Aligning apk...
    zipalign -p -f 4 compiled\signed.apk compiled\release.apk
)
IF NOT "%ERRORLEVEL%"=="0" GOTO :EOF


@ECHO Done.
