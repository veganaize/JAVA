Java Essentials
===============

_A quick reference for Java fundamentals._

| KEYWORDS |            |           |          |
|:---------|:-----------|:----------|:---------|
| abstract | else       | int       | strictfp
| assert   | enum       | interface | super
| boolean  | extends    | long      | switch
| break    | false      | native    | synchronized
| byte     | [final](https://en.wikipedia.org/wiki/Final_(Java)) | new | this
| case     | finally    | null      | throw
| catch    | float      | package   | throws
| char     | for        | private   | transient
| class    | goto       | protected | true
| const    | if         | public    | try
| continue | implements | return    | void
| default  | import     | short     | volatile
| do       | instanceof | static    | while
| double


[File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)
------

- [`length`](https://docs.oracle.com/javase/8/docs/api/java/io/File.html#length--)`() : long`


[HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
---------

- [`containsKey`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#containsKey-java.lang.Object-)`(Object key) : boolean`
- [`get`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#get-java.lang.Object-)`(Object key) : V`
- [`getOrDefault`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#getOrDefault-java.lang.Object-V-)`(Object key, V defaultValue) : V`
- [`put`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#put-K-V-)`(K key, V value) : V`


[Math](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)
------

<details><summary><code>Math.min(a, b)</code></summary>

- [`Math.min`](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-double-double-)`(double a, double b) : double`
- [`Math.min`](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-float-float-)`(float a, float b) : float`
- [`Math.min`](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-int-int-)`(int a, int b) : int`
- [`Math.min`](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-long-long-)`(long a, long b) : long`
</details>

- [`Math.pow`](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#pow-double-double-)`(double base, double exponent) : double`


[Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)
-------

- [`empty`](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#empty--)`() : boolean`
- [`peek`](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#peek--)`() : E`
- [`pop`](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#pop--)`() : E`
- [`push`](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#push-E-)`(E item) : E`
- [`search`](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#search-java.lang.Object-)`(Object o) : int`


[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
--------

<details><summary><code>indexOf(..)</code></summary>
  
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-int-)`(int character) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-int-int-)`(int character, int fromIndex) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-java.lang.String-)`(String string) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-java.lang.String-int-)`(String string, int fromIndex) : int`
</details>
<details><summary><code>split(..)</code></summary>
  
- [`split`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-)`(String regex) : String[]`
- [`split`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-int-)`(String regex, int limit) : String[]`
</details>


[StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
---------------

- [`append`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#append-java.lang.Object-)`(..) : StringBuilder`
- [`charAt`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#charAt-int-)`(int index) : char`
- [`delete`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#delete-int-int-)`(int start, int end) : StringBuilder`
<details><summary><code>indexOf(..)</code></summary>
  
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#indexOf-java.lang.String-)`(String str) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#indexOf-java.lang.String-int-)`(String str, int fromIndex) : int`
</details>

- [`insert`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#insert-int-char:A-int-int-)`(..) : StringBuilder`
<details><summary><code>substring(..)</code></summary>

- [`substring`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#substring-int-)`(int start) : String`
- [`substring`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#substring-int-int-)`(int start, int end) : String`
</details>
