# <img src="https://github.com/veganaize/JAVA/assets/7102064/c59bd652-ce13-4195-b2c5-b51c0d19ba36" width="32" /> JAVA

<details>
<summary>Coding Conventions</summary>

  * [Java Code Style Guidelines](https://www.cs.cornell.edu/courses/JavaAndDS/JavaStyle.html) - cornell
  * [Java Code Conventions](https://www.oracle.com/technetwork/java/codeconventions-150003.pdf) - sun
  * [Java Style Guide](https://google.github.io/styleguide/javaguide.html) - google
  * [Secure Coding Guidelines](https://www.oracle.com/java/technologies/javase/seccodeguide.html) - oracle
  * [Checkstyle](https://checkstyle.org/) _(v9.3 is last jre 8 compatible)_
    - [Command Line](https://checkstyle.sourceforge.io/version/9.3/cmdline.html) v9.3 - documentation
    - [GitHub](https://github.com/checkstyle/checkstyle/releases/tag/checkstyle-9.3) v9.3 - jar release
    - [Maven](https://repo1.maven.org/maven2/com/puppycrawl/tools/checkstyle/9.3/) v9.3 - jar release
</details>


<details>
<summary>Tutorials</summary>
  
  * [Java Programming](https://en.wikibooks.org/wiki/Java_Programming) - wikibooks
  * [Official Tutorial](https://docs.oracle.com/javase/tutorial/) - oracle ([_history_](https://docs.oracle.com/javase/tutorial/information/history.html))
    - [Collections](https://docs.oracle.com/javase/tutorial/collections/index.html)
    - [Date Time](https://docs.oracle.com/javase/tutorial/datetime/index.html)
    - [Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)
  * [Java Tutorials](http://tutorials.jenkov.com/) - jakob jenkov
</details>


<details>
<summary>Guides</summary>

  * [Annotations](https://docs.oracle.com/javase/6/docs/technotes/guides/language/annotations.html)
  * Collections [[8](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/)]
    - API Design FAQ [[11](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/doc-files/coll-designfaq.html)]
    - Framework Outline [[11](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/doc-files/coll-reference.html)]
    - Package Summary [[11](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/package-summary.html)]
  * [Debugger](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/jdb.html) - jdb
  * [Java 2D](https://docs.oracle.com/javase/8/docs/technotes/guides/2d/)
  * jshell - [[_user guide_](https://docs.oracle.com/en/java/javase/21/jshell/java-shell-user-guide.pdf)] [[_man page_](https://docs.oracle.com/en/java/javase/21/docs/specs/man/jshell.html)] [[module summary](https://docs.oracle.com/en/java/javase/21/docs/api/jdk.jshell/module-summary.html)]
  * [javadoc](https://www.oracle.com/java/technologies/javase/javadoc-tool.html) - [[_how to write_](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)] [[technotes](https://docs.oracle.com/javase/7/docs/technotes/tools/solaris/javadoc.html)] [[_wikipedia_](https://en.wikipedia.org/wiki/Javadoc)]
  * [javac](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javac.html) - [[_hacker’s guide_](https://scg.unibe.ch/archive/projects/Erni08b.pdf)]
</details>


<details>
<summary>Build Tools</summary>

  * [javac](https://docs.oracle.com/en/java/javase/21/docs/specs/man/javac.html) - online man page
    ```
    javac -source 1.4 -target 1.4 -Xlint:-options -bootclasspath j2sdk1.4.2_19\lib\classes.zip -extdirs "" *.java
    ```
  * [Eclipse Compiler for Java (ECJ)](http://blog.deepakazad.com/2010/05/ecj-eclipse-java-compiler.html) - coder lounge
    - [Using the batch compiler](https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Ftasks%2Ftask-using_batch_compiler.htm) - eclipse docs
    - [Eclipse JDT Core](https://github.com/eclipse-jdt/eclipse.jdt.core) - github
  * [Apache Ant](https://ant.apache.org/manual/) - online docs
  * [Java Archive (JAR) Files](https://docs.oracle.com/javase/8/docs/technotes/guides/jar/index.html) - oracle
  * [javapackager](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javapackager.html) - oracle
    ```
    javapackager -createjar -appclass package.ClassName -srcdir classes -outdir out -outfile outjar -v
    ```
</details>


<details>
<summary>Testing</summary>

  * [Programming With Assertions](https://docs.oracle.com/javase/8/docs/technotes/guides/language/assert.html) - oracle
  * [javap](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javap.html)
    ```
    javap -verbose ClassName  # Get class file version
    ```
  * [ArchUnit](https://github.com/TNG/ArchUnit)
  * [JUnit 5](https://junit.org/junit5/)
  * [JUnit 4](https://junit.org/junit4/)
    - [maven repo](https://repo1.maven.org/maven2/junit/junit/)
    - [junit-4.13.2](https://repo1.maven.org/maven2/junit/junit/4.13.2/) - last in 4.x series
  * [TestNG](https://testng.org/)
    - [maven repo](https://repo1.maven.org/maven2/org/testng/testng/)
    - [testng-7.5.1](https://repo1.maven.org/maven2/org/testng/testng/7.5.1/) - last jdk8 compatible
</details>


<details>
<summary>JVM</summary>

  * JVMs
    - [GraalVM](https://openjdk.org/projects/graal/) - openjdk
    - [Java VM Architecture Explained](https://www.freecodecamp.org/news/jvm-tutorial-java-virtual-machine-architecture-explained-for-beginners/) - freecodecamp
    - [Java VM Guide](https://docs.oracle.com/en/java/javase/21/vm/java-virtual-machine-guide.pdf) - oracle
    - [Java SE VM Specifications](https://docs.oracle.com/javase/specs/) - oracle
    - [OpenJ9](https://eclipse.dev/openj9/) - eclipse
   
  * Benchmark Suite
    - [DaCapo](https://www.dacapobench.org/)
    - [SPECjvm2008](https://www.spec.org/jvm2008/)
   
  * Monitor
    - [JConsole](https://docs.oracle.com/javase/8/docs/technotes/guides/management/jconsole.html)
    - [VisualVM](https://docs.oracle.com/javase/8/docs/technotes/guides/visualvm/index.html) [[_intro video_](https://youtu.be/z8n7Bg7-A4I)]
</details>


<details>
<summary>Database</summary>
  
  * [Apache Derby](https://db.apache.org/derby/) - full-featured, open source relational database management system (RDBMS) that is based on Java technology and SQL.

    Derby is written and implemented completely in the Java programming language. Derby provides users with a small-footprint standards-based database engine that can be tightly embedded into any Java based solution.  Derby ensures data integrity and provides sophisticated transaction support. In the default configuration there is no separate database server to be installed or maintained by the end user.

    The on-disk database format used by Derby is portable and platform-independent. You can move Derby databases from machine to machine without needing to modify the data. A Derby application can include a pre-built, populated database if it needs to, and that database will work in any Derby configuration. 
</details>


<details>
<summary>Web</summary>

  * [Jetty](https://eclipse.dev/jetty/) - full-featured, standards based, open source web server and servlet container, providing support for HTTP/2, WebSocket, OSGi, JMX, JNDI, JAAS and other integrations.  It's asynchronous, embeddable, extensible, and has a small footprint.
</details>


<details>
<summary>GUI</summary>

  * [JavaFX](https://openjfx.io/)
    - API [[2.2](https://docs.oracle.com/javafx/2/api/)] [[8](https://docs.oracle.com/javase/8/javafx/api/toc.htm)] [[11](https://openjfx.io/javadoc/11/)] [[17](https://openjfx.io/javadoc/17/)] [[21](https://openjfx.io/javadoc/21/)]
    - Docs [[2.x](https://docs.oracle.com/javafx/2/)] [[8](https://docs.oracle.com/javase/8/javase-clienttechnologies.htm)]
    - [FAQ](https://www.oracle.com/java/technologies/javafx/faq-javafx.html)
    - CSS Reference [[2.2](https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html)] [[8](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/doc-files/cssref.html)] [[11](https://openjfx.io/javadoc/11/javafx.graphics/javafx/scene/doc-files/cssref.html)] [[17](https://openjfx.io/javadoc/17/javafx.graphics/javafx/scene/doc-files/cssref.html)] [[21](https://openjfx.io/javadoc/21/javafx.graphics/javafx/scene/doc-files/cssref.html)]
    - [Sample Applications & Tutorials](https://docs.oracle.com/javase/8/javafx/sample-apps/index.html)
  * [Swing](https://en.wikipedia.org/wiki/Swing_(Java))
    - [API Docs](https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html)
    - [Event dispatch thread](https://en.wikipedia.org/wiki/Event_dispatching_thread)
    - [Swing Architecture Overview](https://www.oracle.com/java/technologies/a-swing-architecture.html)
    - [Tutorial](https://docs.oracle.com/javase/tutorial/uiswing/)
  * [SWT](https://en.wikipedia.org/wiki/Standard_Widget_Toolkit)
    - [github](https://github.com/eclipse-platform/eclipse.platform.swt)
  * [AWT](https://en.wikipedia.org/wiki/Abstract_Window_Toolkit)
    - [API Docs](https://docs.oracle.com/javase/8/docs/api/java/awt/package-summary.html)
    - [technotes](https://docs.oracle.com/javase/8/docs/technotes/guides/awt/)
</details>

[Supplementary Characters in the Java Platform](https://www.oracle.com/technical-resources/articles/javase/supplementary.html)


---


<img src="https://user-images.githubusercontent.com/7102064/159777738-8d923779-60d7-44e8-a6ec-4cefb6c9b0d0.png" width="16px"
/> <a href="https://en.wikipedia.org/wiki/Java_version_history">Java Version History</a>

[The Java Version Almanac](https://javaalmanac.io/)


<details>
<summary>JDK 1.0</summary>

  - _Class File Version: 45_
  - [_API Documentation_](http://web.archive.org/web/19980215011741/http://java.sun.com/products/jdk/1.0.2/api/)
  - [_The Java Language Specification 1.0_](http://titanium.cs.berkeley.edu/doc/java-langspec-1.0.pdf) _- 1996_
</details>


<details>
<summary>JDK 1.1</summary>

  - _Class File Version: 45.3_
  - [_API Documentation_](http://web.archive.org/web/19980214234554/http://java.sun.com/products/jdk/1.1/docs/api/packages.html) [[_.hlp_](https://javadoc.allimant.org/dist/jdk118.zip)]
  - [_The Java Language Specification 1.0_](http://titanium.cs.berkeley.edu/doc/java-langspec-1.0.pdf) _- 1996_
</details>


<details>
<summary>JDK 1.2</summary>

  - _Class File Version: 46_
  - [_API Documentation_](https://javaalmanac.io/jdk/1.2/api/index.html)
  - [_The Java Language Specification 1.0_](http://titanium.cs.berkeley.edu/doc/java-langspec-1.0.pdf) _- 1996_
</details>


<details>
<summary>JDK 1.3</summary>

  - _Class File Version: 47_
  - _Minimum Target Version: 1.1_
  - [_API Documentation_](https://javaalmanac.io/jdk/1.3/api/index.html)
  - [_The Java Language Specification 2.0_](http://titanium.cs.berkeley.edu/doc/java-langspec-2.0.pdf) _- 2000_
</details>


<details>
<summary>JDK 1.4</summary>

  - _Class File Version: 48_
  - _Minimum Source Version: 1.2_
  - _Minimum Target Version: 1.1_
  - [_API Documentation_](https://javaalmanac.io/jdk/1.4/api/index.html)
  - [_The Java Language Specification 2.0_](http://titanium.cs.berkeley.edu/doc/java-langspec-2.0.pdf) _- 2000_
</details>


<details>
<summary>JDK 5</summary>

  - _Class File Version: 49_
  - _Minimum Source Version: 1.2_
  - _Minimum Target Version: 1.1_
  - [_API Documentation_](https://web.mit.edu/java_v1.5.0_22/distrib/share/docs/index.html) ([_.chm_](https://javadoc.allimant.org/dist/jdk150.zip))
  - [_Java 1.5 grammar (ANTLR v3)_](http://web.archive.org/web/20120904064302id_/https://www.antlr.org/grammar/1152141644268/Java.g)
  - [_Java Language Specification 3_](https://docs.oracle.com/javase/specs/jls/se6/jls3.pdf) _- 2005_
</details>


<details>
<summary>JDK 6 </summary>

  - _Class File Version: 50_
  - [_API Documentation_](https://docs.oracle.com/javase/6/docs/api/) ([_.chm_](https://javadoc.allimant.org/dist/j2se6.zip))
  - [_Java Language Specification 3_](https://docs.oracle.com/javase/specs/jls/se6/jls3.pdf) _- 2005_
  - _Features_
    - [swing enhancements](https://docs.oracle.com/javase/7/docs/technotes/guides/swing/enhancements-6.html)
    - [writer for .gif format](https://docs.oracle.com/javase/8/docs/technotes/guides/imageio/enhancements60.html#gif)
    - [jar and zip enhancements](https://docs.oracle.com/javase/6/docs/technotes/guides/jar/changes6.html)
    - [javafx 2.2 compatible](https://www.oracle.com/java/technologies/javafx2-archive-downloads.html)
    - [threeten-backport (date-time) compatible](https://www.threeten.org/threetenbp/)
</details>

<details>
<summary>JDK 7 <i>(LTS - 07/2022)</i></summary>

  - _Class File Version: 51_
  - _Minimum Source Version: 1.2_
  - _Minimum Target Version: 1.1_
  - [_API Documentation_](https://docs.oracle.com/javase/7/docs/api/)  (_.chm: [tutorial](https://javadoc.allimant.org/dist/java-tutorial-2011-07-20.zip); [api docs](https://javadoc.allimant.org/dist/j2se7.zip)_)
  - [_Developer Guides_](https://docs.oracle.com/javase/7/docs/)
  - [_Features_](https://openjdk.org/projects/jdk7/features/)
    - [swing enhancements](https://docs.oracle.com/javase/7/docs/technotes/guides/swing/enhancements-7.html)
    - [javafx 2.2](https://blogs.oracle.com/java/post/javafx-22-documentation) (jdk7u6)
    - [binary literals](https://docs.oracle.com/javase/7/docs/technotes/guides/language/binary-literals.html)
    - [numeric literal underscores](https://docs.oracle.com/javase/7/docs/technotes/guides/language/underscores-literals.html)
    - [strings in switch](https://docs.oracle.com/javase/7/docs/technotes/guides/language/strings-switch.html)
    - [diamond operator](https://docs.oracle.com/javase/7/docs/technotes/guides/language/type-inference-generic-instance-creation.html)
    - [try with resources](https://docs.oracle.com/javase/7/docs/technotes/guides/language/try-with-resources.html)
    - [catch multiple exceptions](https://docs.oracle.com/javase/7/docs/technotes/guides/language/catch-multiple.html)
    - [file nio 2](https://www.oracle.com/technical-resources/articles/javase/nio.html)
      - [wikipedia](https://en.wikipedia.org/wiki/Non-blocking_I/O_(Java)#JDK_7_and_NIO.2)
      - [tutorial](https://docs.oracle.com/javase/tutorial/essential/io/fileio.html)
      - [zip filesystem](https://docs.oracle.com/javase/7/docs/technotes/guides/io/fsp/zipfilesystemprovider.html)
    - [ecc cryptography](https://openjdk.org/projects/jdk7/features/#f73)
    - [tls 1.2](https://openjdk.org/projects/jdk7/features/#fa534339)
    - [unicode 6.0](https://openjdk.org/projects/jdk7/features/#f497)
    - [nimbus theme](https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/nimbus.html) (6u10)
    - [threeten-backport (date-time) compatible](https://www.threeten.org/threetenbp/)
  - [_Language Spec_](https://docs.oracle.com/javase/specs/jls/se7/html/index.html) _- 2013_
</details>


<details>
<summary>JDK 8 <i>(LTS - 12/2030)</i></summary>

  - _Class File Version: 52_
  - _Minimum Source Version: 1.2_
  - _Minimum Target Version: 1.1_
  - [_Documentation Home_](https://docs.oracle.com/javase/8/)
  - [_API Documenation_](https://docs.oracle.com/javase/8/docs/api/) ([_.chm_](https://javadoc.allimant.org/dist/j2se8.zip))
  - [_Features_](https://openjdk.org/projects/jdk8/features) _/_ [_What's New_](https://www.oracle.com/java/technologies/javase/8-whats-new.html)
    - [date-time api](https://www.threeten.org/) ([threeten supplemental guide](https://www.threeten.org/articles/index.html)) ([java mag article](https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html)) ([jsr 310 guide](https://jcp.org/aboutJava/communityprocess/pfd/jsr310/JSR-310-guide.html))
    - [javadoc doclint](https://openjdk.org/jeps/172)
    - [javadoc in `javax.tools`](https://openjdk.org/jeps/106)
    - [javafx 8](https://pixelduke.wordpress.com/2013/08/22/whats-new-in-java-8-part-i-javafx/)
    - [jdbc 4.2](https://openjdk.org/jeps/170)
    - [lambda expressions](https://openjdk.org/projects/lambda/) ([java tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)) ([quick start](https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html)) ([part 1](https://www.oracle.com/technical-resources/articles/java/architect-lambdas-part1.html)) ([part2](https://www.oracle.com/technical-resources/articles/java/architect-lambdas-part2.html)) ([oreilly 1](https://www.oreilly.com/content/whats-new-in-java-8-lambdas/)) ([oreilly 2](https://www.oreilly.com/content/java-8-functional-interfaces/)) ([lambda state](https://cr.openjdk.org/~briangoetz/lambda/lambda-state-final.html))
    - [method references](https://openjdk.org/jeps/126) ([java tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html))
    - [swing enhancements](https://docs.oracle.com/javase/8/docs/technotes/guides/swing/enhancements-8.html)
    - [unicode 6.2](https://openjdk.org/jeps/133)
  - [_Language Spec_](https://docs.oracle.com/javase/specs/jls/se8/html/index.html) _- 2015_
  - [_Developer Guides_](https://docs.oracle.com/javase/8/docs/)
  - [_JDK Tools and Utilities_](https://docs.oracle.com/javase/8/docs/technotes/tools/)
  - [_Tutorial_](https://docs.oracle.com/javase/tutorial/)
  - [_Download_](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
</details>


<details>
<summary>JDK 9</summary>

  - _Class File Version: 53_
  - [_Features_](https://openjdk.org/projects/jdk9/)
    - [ahead-of-time compilation (using graal backend)](https://openjdk.org/jeps/295)
    - [compile for old platform versions](https://openjdk.org/jeps/247)
    - [convenience factory methods for collections](https://openjdk.org/jeps/269)
    - [disable sha-1 certificates](https://openjdk.org/jeps/288)
    - [gtk 3 on linux](https://openjdk.org/jeps/283)
    - [hidpi graphics on windows and linux](https://openjdk.org/jeps/263)
    - [javadoc search](https://openjdk.org/jeps/225)
    - [javapackager (modular app packaging)](https://openjdk.org/jeps/275)
    - [jlink](https://openjdk.org/jeps/282)
    - [jshell](https://openjdk.org/jeps/222) ([_tutorial_](https://cr.openjdk.org/~rfield/tutorial/JShellTutorial.html))
    - [milling project coin](https://openjdk.org/jeps/213)
    - [module system](https://openjdk.org/jeps/261)
    - [modular jdk](https://openjdk.org/jeps/200)
    - [multi-release jar files](https://openjdk.org/jeps/238)
    - [platform specific desktop features](https://openjdk.org/jeps/272)
    - [sha-3 hash algorithms](https://openjdk.org/jeps/287)
    - [tiff image i/o](https://openjdk.org/jeps/262)
    - [unicode 8.0](https://openjdk.org/jeps/267)
</details>
<details>
<summary>JDK 10</summary>

  - _Class File Version: 54_
  - [_Features_](https://openjdk.org/projects/jdk/10/)
    - [local-variable type inference](https://openjdk.org/jeps/286)
    - [jit compiler (java-based; graal; experimental)](https://openjdk.org/jeps/317)
    - [root certificates](https://openjdk.org/jeps/319)
</details>


<details>
<summary>JDK 11 <i>(LTS - <del>09/2026</del> 01/2032)</i></summary>

  - _Class File Version: 55_
  - _Minimum Source Version: 6_
  - _Minimum Target Version: 1.6_
  - [_API Documentation_](https://docs.oracle.com/en/java/javase/11/docs/api/)
  - [_Features_](https://openjdk.org/projects/jdk/11/)
    - [flight recorder](https://openjdk.org/jeps/328)
    - [http client](https://openjdk.org/jeps/321)
    - [launch single-file source-code programs](https://openjdk.org/jeps/330)
    - [local-variable syntax for lambda parameters](https://openjdk.org/jeps/323)
    - [transport layer security (tls) 1.3](https://openjdk.org/jeps/332)
    - [unicode 10](https://openjdk.org/jeps/327)
    - [removed javafx modules](https://www.oracle.com/docs/tech/java/javaclientroadmapupdate2018mar.pdf)
    - [removed java web start (oracle)](https://www.oracle.com/technetwork/java/javase/javaclientroadmapupdate2018mar-4414431.pdf)
  - [_Language Spec_](https://docs.oracle.com/javase/specs/jls/se11/html/index.html) _- 2018_
</details>


<details>
<summary>JDK 12</summary>

  - _Class File Version: 56_
</details>


<details>
<summary>JDK 13</summary>

 - _Class File Version: 57_
</details>


<details>
<summary>JDK 14</summary>

  - _Class File Version: 58_
  - [_Features_](https://openjdk.org/projects/jdk/14/)
    - [switch expressions](https://openjdk.org/jeps/361)
    - [removed pack200](https://openjdk.org/jeps/367)
</details>


<details>
<summary>JDK 15</summary>

  - _Class File Version: 59_
  - [_Features_](https://openjdk.org/projects/jdk/15/)
    - [eddsa signature algo](https://openjdk.org/jeps/339)
    - [shenandoah low-pause gc](https://openjdk.org/jeps/379)
    - [text blocks](https://openjdk.org/jeps/378)
    - [zgc scalable low-latency gc](https://openjdk.org/jeps/377)
    - [removed nashorn](https://openjdk.org/jeps/372)
</details>


<details>
<summary>JDK 16</summary>

  - _Class File Version: 60_
  - [_Features_](https://openjdk.org/projects/jdk/16/)
    - [jpackage (packaging tool)](https://openjdk.org/jeps/392)
    - [unix-domain socket channels](https://openjdk.org/jeps/380)
    - [records](https://openjdk.org/jeps/395) ([record classes](https://docs.oracle.com/en/java/javase/16/language/records.html)) ([serializable records](https://docs.oracle.com/en/java/javase/16/serializable-records/index.html))
</details>


<details>
<summary>JDK 17 <i>(LTS >= 09/2029)</i></summary>
  
  - _Class File Version: 61_
  - _Minimum Source Version: 7_
  - _Minimum Target Version: 7_
  - [_API Documentation_](https://docs.oracle.com/en/java/javase/17/docs/api/)
  - [_Features_](https://openjdk.org/projects/jdk/17/) _([release notes](https://www.oracle.com/java/technologies/javase/17-relnote-issues.html))_
    - [removed graal aot and jit compiler (retain JVMCI support for external compilers)](https://openjdk.org/jeps/410)
    - [sealed classes](https://openjdk.org/jeps/409)
  - [_Language Spec_](https://docs.oracle.com/javase/specs/jls/se17/html/index.html) _- 2021_
  - [_Download_](https://github.com/adoptium/temurin17-binaries/releases)
</details>


<details>
<summary>JDK 18</summary>

  - _Class File Version: 62_
  - [_Features_](https://openjdk.org/projects/jdk/18/)
    - [utf-8 by default](https://openjdk.org/jeps/400)
    - [simple web server](https://openjdk.org/jeps/408) ([oracle blog](https://blogs.oracle.com/javamagazine/post/java-18-simple-web-server?source=:em:nw:mt::::RC_WWMK200429P00043C0056:NSL400230298))
    - [code snippets in api docs](https://openjdk.org/jeps/413)
    - [inet address resolution](https://openjdk.org/jeps/418)
</details>


<details>
<summary>JDK 19</summary>

  - _Class File Version: 63_
  - [_Features_](https://openjdk.org/projects/jdk/19/)
    - [linux risc-v port](https://openjdk.org/jeps/422)
</details>


<details>
<summary>JDK 20</summary>

  - _Class File Version: 64_
</details>


<details>
<summary>JDK 21 <i>(LTS - 09/2031)</i></summary>

  - _Class File Version: 65_
  - _Minimum Source Version: 8_
  - _Minimum Target Version: 8_
  - [_Features_](https://openjdk.org/projects/jdk/21/) _([release notes](https://www.oracle.com/java/technologies/javase/21-relnote-issues.html))_
    - [unnamed classes / instance main methods](https://openjdk.org/jeps/445) (preview)
    - [virtual threads](https://openjdk.org/jeps/444)
    - [sequenced collections](https://openjdk.org/jeps/431)
- [_Language Spec_](https://docs.oracle.com/javase/specs/jls/se21/html/index.html) _- 2023_
- [_JDK Tools_](https://docs.oracle.com/en/java/javase/21/docs/specs/man/index.html)
- [_Download_](https://jdk.java.net/21/)
</details>


<details>
<summary>JDK 22</summary>

  - _Class File Version: 66_
  - [_Features_](https://openjdk.org/projects/jdk/22/)
    - [_foreign function & memory api_](https://openjdk.org/jeps/454)
    - [_unnamed variables & patterns_](https://openjdk.org/jeps/456)
    - [_launch multi-file source code programs_](https://openjdk.org/jeps/458)
</details>


<details>
<summary>JDK 23</summary>

  - _Class File Version: 67_
  - [_Features_](https://openjdk.org/projects/jdk/23/)
    - [_markdown documentation comments_](https://openjdk.org/jeps/467)
</details>


<details>
<summary>JDK 24</summary>

  - _Class File Version: 68_
  - [_Features_](https://openjdk.org/projects/jdk/24/)
    - [_aot class loading & linking_](https://openjdk.org/jeps/483)
    - [_permanently disable security manager_](https://openjdk.org/jeps/486)
    - [_quantum resistant key encapsulation_](https://openjdk.org/jeps/496)
    - [_quantum resistant digital signature algorithm_](https://openjdk.org/jeps/497)
    - [_removed windows 32-bit x86 support_](https://openjdk.org/jeps/479)
    - [_stream gatherers_](https://openjdk.org/jeps/485)
</details>
