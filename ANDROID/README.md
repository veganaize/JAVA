🤖 ANDROID
==========

* [Android Version History](https://en.wikipedia.org/wiki/Android_version_history)

* [Android-x86](https://www.android-x86.org/)
    - [💿 Android-x86 4.4 Kitkat](https://sourceforge.net/projects/android-x86/files/Release%204.4/android-x86-4.4-r5.iso/download)
    - [💿 Android-x86 2.2 Froyo](https://sourceforge.net/projects/android-x86/files/Release%202.2/android-x86-2.2-generic.iso/download)
    - [💿 Android-x86 1.6 Donut](https://sourceforge.net/projects/android-x86/files/Release%201.6-r2/android-x86-1.6-r2.iso/download)


💻 New Skool SDK Tools
----------------------

* [cmdline-tools 8.0 (windows; jdk8)](https://dl.google.com/android/repository/commandlinetools-win-9123335_latest.zip) 🗜️
    <details>
    <summary><i>Install command-line tools (windows)...</i></summary>
    
    ```cmd
    REM -- SET PATHS --
    set JAVA_HOME=c:\progra~1\java\jdk1.8.0_121
    set ANDROID_HOME=c:\android-sdk
    set PATH=%ANDROID_HOME%\cmdline-tools\8.0\bin;%ANDROID_HOME%\platform-tools;%JAVA_HOME%\bin;%PATH%;%ANDROID_HOME%\build-tools\28.0.3;%ANDROID_HOME%\tools;%ANDROID_HOME%\tools\bin
    
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

* [cmdline-tools 8.0 (linux; jdk8)](https://dl.google.com/android/repository/commandlinetools-linux-9123335_latest.zip) 🗜️
* [cmdline-tools 8.0 (mac; jdk8)](https://dl.google.com/android/repository/commandlinetools-mac-9123335_latest.zip) 🗜️

---

_⚠️ You need to manually extract executable from downloaded .jar archive..._
* [aapt2 8.0.2-9289358 (windows)](https://dl.google.com/dl/android/maven2/com/android/tools/build/aapt2/8.0.2-9289358/aapt2-8.0.2-9289358-windows.jar)
* [aapt2 8.0.2-9289358 (linux)](https://dl.google.com/dl/android/maven2/com/android/tools/build/aapt2/8.0.2-9289358/aapt2-8.0.2-9289358-linux.jar)
* [aapt2 8.0.2-9289358 (mac)](https://dl.google.com/dl/android/maven2/com/android/tools/build/aapt2/8.0.2-9289358/aapt2-8.0.2-9289358-osx.jar)

<!--
---

* [d8 (windows)](https://dl.google.com/android/repository/build-tools_r30.0.1-windows.zip)
* [d8 (linux)](https://dl.google.com/android/repository/build-tools_r30.0.1-windows.zip)
* [d8 (mac)](https://dl.google.com/android/repository/build-tools_r30.0.1-windows.zip)
-->

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

* [Tools - r25.2.5 (linux)](https://dl.google.com/android/repository/tools_r25.2.5-linux.zip) 🗜️
* [Tools - r25.2.5 (mac osx)](https://dl.google.com/android/repository/tools_r25.2.5-macosx.zip) 🗜️
* [Tools - r25.2.5 (windows)](https://dl.google.com/android/repository/tools_r25.2.5-windows.zip) 🗜️

---

* [Tools - r24.4.1 (windows xp)](https://dl.google.com/android/repository/tools_r24.4.1-windows.zip) 🗜️
* [🔌 Platform Tools - r23.1.0 (windows xp)](https://dl.google.com/android/repository/platform-tools_r23.1.0-windows.zip) 🗜️

---

* [💼 Support Library - r23.2.1](https://dl.google.com/android/repository/support_r23.2.1.zip) 🗜️
* [🧩 Samples - Android 6.0](https://dl-ssl.google.com/android/repository/samples-23_r02.zip) 🗜️


📎 Resources
------------

* [Creating Icons Tutorial](https://www.gimp.org/tutorials/Creating_Icons/) - GIMP
* [Learn Android](https://www.tutorialspoint.com/android/android_overview.htm) - Tutorials Point
