🤖 ANDROID
==========

* [Android Version History](https://en.wikipedia.org/wiki/Android_version_history)

* [Android-x86](https://www.android-x86.org/) 💿
    - _Download_
        - [Android-x86 4.4 Kitkat](https://sourceforge.net/projects/android-x86/files/Release%204.4/android-x86-4.4-r5.iso/download)
        - [Android-x86 2.2 Froyo](https://sourceforge.net/projects/android-x86/files/Release%202.2/android-x86-2.2-generic.iso/download)
        - [Android-x86 1.6 Donut](https://sourceforge.net/projects/android-x86/files/Release%201.6-r2/android-x86-1.6-r2.iso/download)
    - _HowTo_
        - [Debug Android-x86](https://www.android-x86.org/documentation/debug.html)
        - [Run Android-x86 in VirtualBox](https://www.android-x86.org/documentation/virtualbox.html)


📚 Old Skool Dev Docs
---------------------

* _Online_
    * [Android 1.6 - Donut - API 4](https://minimum-viable-product.github.io/donut-docs/index.html)
    * [Android 2.3.3 - Gingerbread - API 10](http://web.archive.org/web/20110221191816/http://developer.android.com/guide/index.html)
    * [Android 4.0 - Ice Cream Sandwich - API 14](https://minimum-viable-product.github.io/ics-docs/)
    * [Android 4.2 - Jelly Bean - API 17](https://stuff.mit.edu/afs/sipb/project/android/docs/design/index.html)
    * [Android 4.4 - Kitkat - API 19](https://minimum-viable-product.github.io/kitkat-docs/training/index.html)
    * [Android L (preview) - API 20](https://spot.pcc.edu/~mgoodman/developer.android.com/guide/index.html)
    * [Android 6.0 - Marshmallow - API 23](https://minimum-viable-product.github.io/marshmallow-docs/training/index.html)
* _Offline_
    * [Android 4.0 - Ice Cream Sandwich - API 14](https://dl.google.com/android/repository/docs-14_r01.zip) 🗜️
    * [Android 4.2 - Jelly Bean - API 17](https://code.google.com/archive/p/android-chm-documentation/downloads) - CHM format
    * [Android 4.4 - Kitkat - API 19](https://dl.google.com/android/repository/docs-19_r02.zip) 🗜️
    * [Android 6.0 - Marshmallow - API 23](https://dl.google.com/android/repository/docs-23_r01.zip) 🗜️ - _Last to also include non-IDE / command-line instructions in dev guides._
    * [Android 7.0 - Nougat - API 24](https://dl.google.com/android/repository/docs-24_r01.zip) 🗜️


🧰 Old Skool SDK Tools
----------------------

_These include classic `android` command, SDK Manager GUI, and `sdkmanager` command..._
* [Tools - r25.2.5 (linux)](https://dl.google.com/android/repository/tools_r25.2.5-linux.zip) 🗜️
* [Tools - r25.2.5 (mac osx)](https://dl.google.com/android/repository/tools_r25.2.5-macosx.zip) 🗜️
* [Tools - r25.2.5 (windows)](https://dl.google.com/android/repository/tools_r25.2.5-windows.zip) 🗜️

---

_*These include **XP-compatible** `android`, SDK Manager GUI, and no ~~`sdkmanager`~~ command... ([cmdline-tools 8.0](https://dl.google.com/android/repository/commandlinetools-win-9123335_latest.zip) are also **xp/jdk8** compatible, they do include the `sdkmanager` command, and will work happily along side these tools)_
* [Tools - r24.4.1 (windows xp)](https://dl.google.com/android/repository/tools_r24.4.1-windows.zip) 🗜️
* [🔌 Platform Tools - r23.1.0 (windows xp)](https://dl.google.com/android/repository/platform-tools_r23.1.0-windows.zip) 🗜️

---

* [💼 Support Library - r23.2.1](https://dl.google.com/android/repository/support_r23.2.1.zip) 🗜️
* [🧩 Samples - Android 6.0](https://dl-ssl.google.com/android/repository/samples-23_r02.zip) 🗜️

---

### ndk
  - ndk r9d - _03/2014_
    - windows ( [_x86_](https://dl.google.com/android/ndk/android-ndk-r9d-windows-x86.zip) ) ( [_x86-64_](https://dl.google.com/android/ndk/android-ndk-r9d-windows-x86_64.zip) )
    - linux ( [_x86-64_](https://dl.google.com/android/ndk/android-ndk-r9d-linux-x86_64.tar.bz2) )
    - mac ( [_x86-64_](https://dl.google.com/android/ndk/android-ndk-r9d-darwin-x86_64.tar.bz2) )
  - ndk samples - [_`master-obsolete`_](https://github.com/android/ndk-samples/tree/master-obsolete) branch

---

💻 New Skool SDK Tools
----------------------

* **cmdline-tools 8.0** _(jdk 8 compatible; win xp compatible; includes `sdkmanager`)_

    - [Download for Windows](https://dl.google.com/android/repository/commandlinetools-win-9123335_latest.zip) 🗜️
        <details>
        <summary>Windows install instructions...</summary>
        
        ```cmd
        REM -- SET PATHS --
        set JAVA_HOME=c:\progra~1\java\jdk1.8.0_121
        set ANDROID_HOME=c:\android-sdk
        set ANT_HOME=c:\apache-ant
        set PATH=%ANDROID_HOME%\cmdline-tools\8.0\bin;%ANDROID_HOME%\platform-tools;%JAVA_HOME%\bin;%ANT_HOME%\bin;%PATH%;%ANDROID_HOME%\build-tools\28.0.3;%ANDROID_HOME%\tools;%ANDROID_HOME%\tools\bin
        
        REM -- UNPACK TOOLS --
        cd %ANDROID_HOME%
        mkdir cmdline-tools
        cd cmdline-tools
        jar -xf path\to\commandlinetools-win-9123335_latest.zip
        rename cmdline-tools 8.0
        
        REM -- INSTALL OTHERS --
        sdkmanager --licenses
        sdkmanager --list_installed [--include_obsolete]
        sdkmanager --list [--include_obsolete]
        sdkmanager "platform-tools" "build-tools;28.0.3" "platforms;android-19" "platforms;android-14" "platforms;android-10"
        ```
        
        </details>
    
    - [Download for Linux](https://dl.google.com/android/repository/commandlinetools-linux-9123335_latest.zip) 🗜️
        <details>
        <summary>Linux install instructions...</summary>
            
        ```bash
        ## SET PATHS ##
        export ANDROID_HOME=${HOME}/android-sdk
        export PATH=${ANDROID_HOME}/cmdline-tools/8.0/bin:${ANDROID_HOME}/platform-tools:${PATH}:${ANDROID_HOME}/build-tools/30.0.3:${ANDROID_HOME}/tools:${ANDROID_HOME}/tools/bin
        
        ## UNPACK TOOLS ##
        cd ${ANDROID_HOME}
        mkdir cmdline-tools
        cd cmdline-tools
        jar -xvf path/to/commandlinetools-linux-9123335_latest.zip
        mv cmdline-tools 8.0
        chmod a+x 8.0/bin/*
        
        ## INSTALL OTHERS ##
        sdkmanager --version
        sdkmanager --licenses
        sdkmanager --list_installed [--include_obsolete]
        sdkmanager --list [--include_obsolete]
        sdkmanager "platform-tools" "build-tools;30.0.3" "platforms;android-19" "platforms;android-14" "platforms;android-10"
        ```
        </details>
    
    - [Download for Mac](https://dl.google.com/android/repository/commandlinetools-mac-9123335_latest.zip) 🗜️


🔧 New Skool Standalone Tools
-----------------------------

<details>
<summary><b><i>⚙️ AAPT2...</i></b></summary>

1. Download aapt2:
    - [aapt2 8.0.2-9289358 (windows 7+)](https://dl.google.com/dl/android/maven2/com/android/tools/build/aapt2/8.0.2-9289358/aapt2-8.0.2-9289358-windows.jar) 🗜️
    - [aapt2 8.0.2-9289358 (linux)](https://dl.google.com/dl/android/maven2/com/android/tools/build/aapt2/8.0.2-9289358/aapt2-8.0.2-9289358-linux.jar) 🗜️
    - [aapt2 8.0.2-9289358 (mac)](https://dl.google.com/dl/android/maven2/com/android/tools/build/aapt2/8.0.2-9289358/aapt2-8.0.2-9289358-osx.jar) 🗜️
2. Manually extract aapt2 executable from .jar archive:
            
        jar xvf aapt2-8.0.2-9289358-*.jar aapt2*

---

1. Compile app resources:
    - _Incrementally:_

          aapt2 compile -o compiled/ res/<folder>/file.[xml|png] ...
    - _Non-incrementally (simpler, but suboptimal for large projects:_

          aapt2 compile --dir res/ -o res.zip
    - _List files in resulting archive:_

          jar tvf res.zip
2. Link compiled resources...</summary>
            
       aapt2 link \
             compiled/file.flat ... \
             -o compiled/unsigned.apk \
             --manifest AndroidManifest.xml \
             -I ${ANDROID_HOME}/platforms/android-14/android.jar \
             --java gen    

---

</details>
<details>
<summary><b><i>⚙️ JAVAC...</i></b></summary>

* Download jdk8:
    - [oracle jdk 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
    - [openjdk 8](https://wiki.openjdk.org/display/jdk8u/Main)
    - [graalvm ce java8](https://github.com/graalvm/graalvm-ce-builds/releases/tag/vm-21.3.1)

---

    javac \
        [-g] \
        -source 1.7 \
        -target 1.7 \
        -bootclasspath ${ANDROID_HOME}/platforms/android-14/android.jar \
        -cp gen \
        -d compiled/ \
        src/org/example/pkg/*.java

---

</details>
<details>
<summary><b><i>⚙️ D8/R8...</i></b></summary>
    
* [_Download D8 dexer / R8 shrinker (4.0.63; jdk8)_](https://dl.google.com/android/maven2/com/android/tools/r8/4.0.63/r8-4.0.63.jar) 🗜️

---

1.
   * [D8](https://developer.android.com/tools/d8) is a dexer that converts java byte code to dex code:
         
              java -cp path/to/r8.jar com.android.tools.r8.D8 \
                   --debug \
                   --min-api <min-api> \
                   --output compiled/ \
                   --lib <${ANDROID_HOME}/platforms/android-14/android.jar | rt.jar> \
                   <input.jar | compiled/org/example/pkgname/*.class>
   * [R8](https://r8.googlesource.com/r8) is a whole-program-optimizing-compiler (alternative to ProGuard [shrinking and minification](https://developer.android.com/build/shrink-code) tool) that converts java byte code to optimized dex code:
         
              java -cp path/to/r8.jar com.android.tools.r8.R8 \
                   --release \
                   --min-api <min-api> \
                   --output compiled/ \
                   --pg-conf proguard.cfg \
                   --lib <${ANDROID_HOME}/platforms/android-14/android.jar | rt.jar> \
                   <input.jar | compiled/org/example/pkgname/*.class>
2. _Add dex into apk:_

        jar Muvf compiled/unsigned.apk compiled/classes.dex
   
---

</details>
<details>
<summary><b><i>⚙️ Apksigner...</i></b></summary>

_Generate debug key:_

    keytool -genkey -v \
        -keystore debug.keystore \
        -storepass android \
        -alias androiddebugkey \
        -keypass android \
        -dname "CN=Android Debug, O=Android, C=US" \
        -keyalg RSA \
        -keysize 2048 \
        -validity 10000
_Sign apk:_

    apksigner sign \
        --ks debug.keystore \
        --out compiled/signed.apk \
        compiled/unsigned.apk

    apksigner verify compiled/signed.apk
_Align apk:_

    zipalign -v -p 4 compiled/signed.apk compiled/release.apk

---

</details>
<details>
<summary><b><i>⚙️ ADB...</i></b></summary>
    
    adb install compiled/release.apk

    adb shell am start org.example.pkgname/.ActivityName

    adb uninstall org.example.pkgname

---

</details>
<details>
<summary><b><i>⚙️ Bundletool...</i></b></summary>
    
* [bundletool (1.15.1)](https://github.com/google/bundletool/releases/download/1.15.1/bundletool-all-1.15.1.jar) 🗜️ is a command-line tool to manipulate Android App Bundles (AABs).

---

</details>

📎 Resources
------------

* [Android Asset Studio](https://romannurik.github.io/AndroidAssetStudio/index.html) - Roman Nurik
* [Creating Icons Tutorial](https://www.gimp.org/tutorials/Creating_Icons/) - GIMP
* [Learn Android](https://www.tutorialspoint.com/android/android_overview.htm) - Tutorials Point
