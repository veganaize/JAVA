🤖 ANDROID
==========

* [Android Version History](https://en.wikipedia.org/wiki/Android_version_history)

* [Android-x86](https://www.android-x86.org/)
    - [💿 Android-x86 4.4 Kitkat](https://sourceforge.net/projects/android-x86/files/Release%204.4/android-x86-4.4-r5.iso/download)
    - [💿 Android-x86 2.2 Froyo](https://sourceforge.net/projects/android-x86/files/Release%202.2/android-x86-2.2-generic.iso/download)
    - [💿 Android-x86 1.6 Donut](https://sourceforge.net/projects/android-x86/files/Release%201.6-r2/android-x86-1.6-r2.iso/download)



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
    * [Android 4.4 - Kitkat - API 19](https://dl.google.com/android/repository/docs-19_r02.zip) 🗜️
    * [Android 6.0 - Marshmallow - API 23](https://dl.google.com/android/repository/docs-23_r01.zip) 🗜️ - _Last to also include non-IDE / command-line instructions in dev guides._
    * [Android 7.0 - Nougat - API 24](https://dl.google.com/android/repository/docs-24_r01.zip) 🗜️


🧰 Old Skool SDK Tools
----------------------

_These include classic `android` command, GUI SDK Manager, and `sdkmanager`..._
* [Tools - r25.2.5 (linux)](https://dl.google.com/android/repository/tools_r25.2.5-linux.zip) 🗜️
* [Tools - r25.2.5 (mac osx)](https://dl.google.com/android/repository/tools_r25.2.5-macosx.zip) 🗜️
* [Tools - r25.2.5 (windows)](https://dl.google.com/android/repository/tools_r25.2.5-windows.zip) 🗜️

---

_These include XP-compatible `android`, GUI SDK Manager, but no `sdkmanager` (see: [New Skool SDK Tools](#-new-skool-sdk-tools))..._
* [Tools - r24.4.1 (windows xp)](https://dl.google.com/android/repository/tools_r24.4.1-windows.zip) 🗜️
* [🔌 Platform Tools - r23.1.0 (windows xp)](https://dl.google.com/android/repository/platform-tools_r23.1.0-windows.zip) 🗜️

---

* [💼 Support Library - r23.2.1](https://dl.google.com/android/repository/support_r23.2.1.zip) 🗜️
* [🧩 Samples - Android 6.0](https://dl-ssl.google.com/android/repository/samples-23_r02.zip) 🗜️

---

💻 New Skool SDK Tools
----------------------

* **cmdline-tools 8.0 (jdk 8 compatible)**

    - [Download for Windows](https://dl.google.com/android/repository/commandlinetools-win-9123335_latest.zip) 🗜️
        <details>
        <summary>Install instructions (windows)...</summary>
        
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
        <summary>Install command-line tools (linux)...</summary>
            
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

* ***AAPT2***
    * [aapt2 8.0.2-9289358 (windows 7+)](https://dl.google.com/dl/android/maven2/com/android/tools/build/aapt2/8.0.2-9289358/aapt2-8.0.2-9289358-windows.jar) 🗜️
    * [aapt2 8.0.2-9289358 (linux)](https://dl.google.com/dl/android/maven2/com/android/tools/build/aapt2/8.0.2-9289358/aapt2-8.0.2-9289358-linux.jar) 🗜️
    * [aapt2 8.0.2-9289358 (mac)](https://dl.google.com/dl/android/maven2/com/android/tools/build/aapt2/8.0.2-9289358/aapt2-8.0.2-9289358-osx.jar) 🗜️

        <details>
        <summary>1. Manually extract aapt2 executable from .jar archive...</summary>
            
            jar xvf aapt2-8.0.2-9289358-*.jar aapt2*
        </details>
        
        <details>
        <summary>2. Compile app resources...</summary>
            
        _Incrementally:_
            
            aapt2 compile -o compiled/ res/<folder>/file.[xml|png] ...
        _Non-incrementally (simpler, but suboptimal for large projects:_
           
            aapt2 compile --dir res/ -o res.zip
        _List files in resulting archive:_
           
            jar tvf res.zip
        </details>
        
        <details>
        <summary>3. Link compiled resources...</summary>
            
                aapt2 link \
                    compiled/file.flat ... \
                    -o compiled/unsigned.apk \
                    --manifest AndroidManifest.xml \
                    -I ${ANDROID_HOME}/platforms/android-14/android.jar \
                    --java gen    
        </details>

---

* ***D8/R8***
    - [Download D8 dexer / R8 shrinker (4.0.63; jdk8)](https://dl.google.com/android/maven2/com/android/tools/r8/4.0.63/r8-4.0.63.jar)
        <details>
        <summary><a href="https://developer.android.com/tools/d8">D8</a> is a dexer that converts java byte code to dex code...</summary>
         
              java -cp path/to/r8.jar com.android.tools.r8.D8 \
                   --debug \
                   --min-api <min-api> \
                   --output compiled/ \
                   --lib <${ANDROID_HOME}/platforms/android-14/android.jar | rt.jar> \
                   <input.jar | compiled/org/example/pkgname/*.class>
        </details>
        <details>
        <summary><a href="https://r8.googlesource.com/r8">R8</a> is a whole-program-optimizing-compiler (alternative to the ProGuard <a href="https://developer.android.com/build/shrink-code">shrinking and minification</a> tool) that converts java byte code to optimized dex code...</summary>
         
              java -cp path/to/r8.jar com.android.tools.r8.R8 \
                   --release \
                   --min-api <min-api> \
                   --output compiled/ \
                   --pg-conf proguard.cfg \
                   --lib <${ANDROID_HOME}/platforms/android-14/android.jar | rt.jar> \
                   <input.jar | compiled/org/example/pkgname/*.class>
        </details>

---

* ***Bundletool***
    - [bundletool (1.15.1)](https://github.com/google/bundletool/releases/download/1.15.1/bundletool-all-1.15.1.jar) is a command-line tool to manipulate Android App Bundles (AAB).

---

📎 Resources
------------

* [Creating Icons Tutorial](https://www.gimp.org/tutorials/Creating_Icons/) - GIMP
* [Learn Android](https://www.tutorialspoint.com/android/android_overview.htm) - Tutorials Point
