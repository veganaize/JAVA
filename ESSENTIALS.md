Java Essentials
===============

_A quick reference for Java fundamentals._

| KEYWORDS |            |           |          |
|:---------|:-----------|:----------|:---------|
| abstract | else       | int       | strictfp
| [assert](https://docs.oracle.com/javase/8/docs/technotes/guides/language/assert.html)   | enum       | interface | super
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


| DATA TYPES | PRIMATIVE |   |
|------------|-----------|---|
| [Boolean](https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html)    | boolean   | true / false
| [Byte](https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html)       | byte      | 8-bit signed (-128 - 127)
| [Character](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)  | char      | 16-bit unsigned ([UCS](https://en.wikipedia.org/wiki/Universal_Coded_Character_Set)-2 / [UTF-16](https://en.wikipedia.org/wiki/UTF-16))
| [Short](https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html)      | short     | 16-bit signed (-32_768 - 32_767)
| [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)    | int       | 32-bit signed (-2_147_483_648 - 2_147_483_647)
| [Long](https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html)       | long      | 64-bit signed (-9_223_372_036_854_775_808 - 9_223_372_036_854_775_807)
| [Float](https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html)      | float     | 32-bit signed (1.4E-45 - 3.4028235E38)
| [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html)     | double    | 64-bit signed (4.9E-324 - 1.7976931348623157E308)


[ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
-----------

- [`size`](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#size--)`() : int`

[Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)
--------

- [`Arrays.asList`](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList-T...-)`(T... a) : <T> List<T>`


[Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html)
-------------


[File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)
------

- [`length`](https://docs.oracle.com/javase/8/docs/api/java/io/File.html#length--)`() : long`


[HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
---------

- [`containsKey`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#containsKey-java.lang.Object-)`(Object key) : boolean`
- [`get`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#get-java.lang.Object-)`(Object key) : V`
- [`getOrDefault`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#getOrDefault-java.lang.Object-V-)`(Object key, V defaultValue) : V`
- [`put`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#put-K-V-)`(K key, V value) : V`
- [`size`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#size--)`() : int`


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

- [`equals`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#equals-java.lang.Object-)`(Object o) : boolean`
<details><summary><code>indexOf(..)</code></summary>
  
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-int-)`(int character) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-int-int-)`(int character, int fromIndex) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-java.lang.String-)`(String string) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-java.lang.String-int-)`(String string, int fromIndex) : int`
</details>

- [`length`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#length--)`() : int`
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
- [`length`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#length--)`() : int`
<details><summary><code>substring(..)</code></summary>

- [`substring`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#substring-int-)`(int start) : String`
- [`substring`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#substring-int-int-)`(int start, int end) : String`
</details>
