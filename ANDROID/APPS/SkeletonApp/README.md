Skeleton App
============

Compile
-------
```cmd
ant debug
```

Install
-------
```cmd
adb [-s <device>] install bin/SkeletonApp-debug.apk
```

Run
---
```cmd
adb [-s <device>] shell am start com.example.pkgname/com.example.pkgname.MainActivity
```

Uninstall
---------
```cmd
adb [-s <device>] uninstall com.example.pkgname
```
