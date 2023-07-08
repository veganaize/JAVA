* [Android-x86](https://www.android-x86.org/)
* [Android Version History](https://en.wikipedia.org/wiki/Android_version_history)


New Skool SDK Tools
-------------------
* [cmdline-tools 8.0 (windows; jdk8)](https://dl.google.com/android/repository/commandlinetools-win-9123335_latest.zip)
* [cmdline-tools 8.0 (linux; jdk8)](https://dl.google.com/android/repository/commandlinetools-linux-9123335_latest.zip)
* [cmdline-tools 8.0 (mac; jdk8)](https://dl.google.com/android/repository/commandlinetools-mac-9123335_latest.zip)

```cmd
REM -- SET PATHS --
set JAVA_HOME=c:\progra~1\java\jdk1.8.0_121
set ANDROID_HOME=c:\android-sdk
set PATH=%ANDROID_HOME%\cmdline-tools\8.0\bin;%ANDROID_HOME%\platform-tools;%JAVA_HOME%\bin;%PATH%;%ANDROID_HOME%\build-tools\28.0.3;%ANDROID_HOME%\tools;%ANDROID_HOME%\tools\bin

REM -- UNPACK TOOLS --
cd %ANDROID_HOME%
mkdir cmdline-tools
cd cmdline-tools
c:\progra~1\7-zip\7z.exe x path\to\commandlinetools-*.zip
rename cmdline-tools 8.0

REM -- INSTALL OTHERS --
sdkmanager --licenses
sdkmanager --list_installed [--include_obsolete]
sdkmanager --list [--include_obsolete]
sdkmanager "platform-tools" "build-tools;28.0.3" "platforms;android-19" "platforms;android-14" "platforms;android-10"
```


Old Skool Dev Docs
------------------

* [Android 1.6 Donut - API 4 - Online App Developer Documentation](https://minimum-viable-product.github.io/donut-docs/index.html)
* [Android 2.3.3 Gingerbread - API 10 - Online App Developer Documentation](http://web.archive.org/web/20110221191816/http://developer.android.com/guide/index.html)
* [Android 4.4 Kitkat - API 19 - Online App Developer Documentation](https://minimum-viable-product.github.io/kitkat-docs/training/index.html)
* [Android 6.0 Marshmallow - API 23 - Online App Developer Documentation](https://minimum-viable-product.github.io/marshmallow-docs/training/index.html)


Old Skool SDK Tools
-------------------

* [Tools - r25.2.5 (windows)](https://dl.google.com/android/repository/tools_r25.2.5-windows.zip)
* [Tools - r25.2.5 (linux)](https://dl.google.com/android/repository/tools_r25.2.5-linux.zip)
* [Tools - r25.2.5 (mac osx)](https://dl.google.com/android/repository/tools_r25.2.5-macosx.zip)
* [Tools - r24.4.1 (windows xp)](https://dl.google.com/android/repository/tools_r24.4.1-windows.zip)
* [Platform Tools - r23.1.0 (windows xp)](https://dl.google.com/android/repository/platform-tools_r23.1.0-windows.zip)

---

* [Support Library - r23.2.1](https://dl.google.com/android/repository/support_r23.2.1.zip)
* [Developer Docs - API 23 (zip archive)](https://dl.google.com/android/repository/docs-23_r01.zip)
* [Developer Docs - API 19 (zip archive)](https://dl.google.com/android/repository/docs-19_r02.zip)
