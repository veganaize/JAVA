[☕ Java](https://docs.oracle.com/javase/8/docs/) Essentials
=========

_A quick reference for Java fundamentals._

---

🔑 Keywords
-----------

|          |            |           |           |
|:---------|:-----------|:----------|:----------|
| abstract | else       | int       | strictfp
| [assert](#assertions-4) <sup>1.4</sup> | enum      | interface | super
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

---

🧩 Data Types
-------------

| Class      | Primitive |   |
|------------|-----------|---|
| [Boolean](https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html)    | boolean   | true / false
| [Byte](https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html)       | byte      | 8-bit signed (-128 - 127)
| [Character](#character)  | char      | 16-bit unsigned ([UCS](https://en.wikipedia.org/wiki/Universal_Coded_Character_Set)-2 / [UTF-16](https://en.wikipedia.org/wiki/UTF-16))
| [Short](https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html)      | short     | 16-bit signed (-32_768 - 32_767)
| [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)    | int       | 32-bit signed (-2_147_483_648 - 2_147_483_647)
| [Long](https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html)       | long      | 64-bit signed (-9_223_372_036_854_775_808 - 9_223_372_036_854_775_807)
| [Float](https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html)      | float     | 32-bit signed (1.4E-45 - 3.4028235E38)
| [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html)     | double    | 64-bit signed (4.9E-324 - 1.7976931348623157E308)

---

### [Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html) <sup>1.2</sup>

- [`Arrays.asList`](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList-T...-)`(T... a) : <T> List<T>`


### [Character](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)

<details><summary><code>Character.isDigit(c)</code></summary>

- [Character.isDigit](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isDigit(char))`(char c) : boolean`
- [Character.isDigit](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isDigit(int))`(int codepoint) : boolean`
</details>
<details><summary><code>Character.isLetter(c)</code></summary>

- [Character.isLetter](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isLetter(char))`(char c) : boolean`
- [Character.isLetter](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isLetter(int))`(int codepoint) : boolean`
</details>
<details><summary><code>Character.isLetterOrDigit(c)</code></summary>

- [Character.isLetterOrDigit](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isLetterOrDigit(char))`(char c) : boolean`
- [Character.isLetterOrDigit](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isLetterOrDigit(int))`(int codepoint) : boolean`
</details>
<details><summary><code>Character.isLowerCase(c)</code></summary>

- [Character.isLowerCase](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isLowerCase(char))`(char c) : boolean`
- [Character.isLowerCase](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isLowerCase(int))`(int codepoint) : boolean`
</details>
<details><summary><code>Character.isSpaceChar(c)</code></summary>

- [Character.isSpaceChar](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isSpaceChar(char))`(char c) : boolean`
- [Character.isSpaceChar](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isSpaceChar(int))`(int codepoint) : boolean`
</details>
<details><summary><code>Character.isUpperCase(c)</code></summary>

- [Character.isUpperCase](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isUpperCase(char))`(char c) : boolean`
- [Character.isUpperCase](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isUpperCase(int))`(int codepoint) : boolean`
</details>
<details><summary><code>Character.toLowerCase(c)</code></summary>

- [Character.toLowerCase](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#toLowerCase-char-)`(char c) : char`
- [Character.toLowerCase](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#toLowerCase-int-)`(int codepoint) : int`
</details>


---


📦 [Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html) <sup>1.2</sup>
----------------

| Interface      | Hash Table         | Resizable Array          | Balanced Tree      | Linked List              | Hash Table + Linked List | Other
|----------------|--------------------|--------------------------|--------------------|--------------------------|--------------------------|------
| [Set][Set]     | [HashSet][HashSet] |                          | [TreeSet][TreeSet] |                          | [LinkedHashSet][LinkedHashSet] <sup>1.4</sup>
| [List][List]   |                    | [ArrayList](#arraylist-2) |                   | [LinkedList][LinkedList] |
| [Queue][Queue] <sup>5</sup> |       | [ArrayDeque][ArrayDeque] <sup>6</sup>|        | [LinkedList][LinkedList] |                          | [PriorityQueue][PriorityQueue] <sup>5</sup>
| [Deque][Deque] <sup>6</sup> |       | [ArrayDeque][ArrayDeque] <sup>6</sup> |       | [LinkedList][LinkedList] |
| [Map](#map-2)  | [HashMap][HashMap] |                          | [TreeMap][TreeMap] |                          | [LinkedHashMap][LinkedHashMap] <sup>1.4</sup>


### [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html) <sup>1.2</sup>

- [`get`](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#get-int-)`(int index) : E`
- [`size`](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#size--)`() : int`


### [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)

- [`length`](https://docs.oracle.com/javase/8/docs/api/java/io/File.html#length--)`() : long`


### [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html) <sup>1.2</sup>

- [`containsKey`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#containsKey-java.lang.Object-)`(Object key) : boolean`
- [`get`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#get-java.lang.Object-)`(Object key) : V`
- [`getOrDefault`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#getOrDefault-java.lang.Object-V-)`(Object key, V defaultValue) : V` <sup>v1.8+</sup>
- [`put`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#put-K-V-)`(K key, V value) : V`
- [`size`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#size--)`() : int`


### [Math](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)

<details><summary><code>Math.min(a, b)</code></summary>

- [`Math.min`](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-double-double-)`(double a, double b) : double`
- [`Math.min`](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-float-float-)`(float a, float b) : float`
- [`Math.min`](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-int-int-)`(int a, int b) : int`
- [`Math.min`](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-long-long-)`(long a, long b) : long`
</details>

- [`Math.pow`](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#pow-double-double-)`(double base, double exponent) : double`


### [Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

- [`empty`](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#empty--)`() : boolean`
- [`peek`](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#peek--)`() : E`
- [`pop`](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#pop--)`() : E`
- [`push`](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#push-E-)`(E item) : E`
- [`search`](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#search-java.lang.Object-)`(Object o) : int`


### [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)

- [`equals`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#equals-java.lang.Object-)`(Object o) : boolean`
<details><summary><code>indexOf(..)</code></summary>
  
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-int-)`(int character) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-int-int-)`(int character, int fromIndex) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-java.lang.String-)`(String string) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-java.lang.String-int-)`(String string, int fromIndex) : int`
</details>

- [`length`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#length--)`() : int`
- [`split`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-int-)`(String regex[, int limit]) : String[]` <sup>v1.4+</sup>
- [`substring`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-)`(int beginAt[, int endBefore]) : String`


### [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html) <sup>5</sup>

- [`append`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#append-java.lang.Object-)`(..) : StringBuilder`
- [`charAt`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#charAt-int-)`(int index) : char`
- [`delete`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#delete-int-int-)`(int start, int end) : StringBuilder`
<details><summary><code>indexOf(..)</code></summary>
  
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#indexOf-java.lang.String-)`(String str) : int`
- [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#indexOf-java.lang.String-int-)`(String str, int fromIndex) : int`
</details>

- [`insert`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#insert-int-char:A-int-int-)`(..) : StringBuilder`
- [`length`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#length--)`() : int`
- [`reverse`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#reverse--)`() : StringBuilder`
<details><summary><code>substring(..)</code></summary>

- [`substring`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#substring-int-)`(int start) : String`
- [`substring`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#substring-int-int-)`(int start, int end) : String`
</details>


---


🐛 Debugging
------------

### [Assertions](https://docs.oracle.com/javase/8/docs/technotes/guides/language/assert.html) <sup>1.4</sup>

```java
java -ea
java -enableassertions

assert <condition> [: <detail message>];

/* Ensure assertions are enabled via static initialization idiom! */
static {
    boolean assertsEnabled = false;
    assert assertsEnabled = true;
    if (! assertsEnabled) { throw new RuntimeException("\n\n ENABLE ASSERTIONS WITH -ea \n\n"); }
} 
```


---


<sup>1.2</sup> _= Since Java 1.2_ \
<sup>1.4</sup> _= Since Java 1.4_ \
<sup>5</sup> _= Since Java 5_ \
<sup>6</sup> _= Since Java 6_ \
<sup>8</sup> _= Since Java 8_


[ArrayList]: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
[ArrayDeque]: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
[Deque]: https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html
[HashMap]: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
[HashSet]: https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
[LinkedHashMap]: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html
[LinkedHashSet]: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html
[LinkedList]: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
[List]: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
[PriorityQueue]: https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html
[Queue]: https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
[Set]: https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
[TreeMap]: https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html
[TreeSet]: https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html
