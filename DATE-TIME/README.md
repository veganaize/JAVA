📆 Java Date & Time
===================

* _The New Way_ ([`java.time`](README.md#javatime-package-1))
    - [`java.time.Instant`](README.md#javatimeInstant-1)
    - [`java.time.Duration`](README.md#javatimeDuration-1)
    - [`java.time.LocalDate/Time`](README.md#javatimeLocalDateTime-1)
    - [`java.time.ZonedDateTime`](README.md#javatimeZonedDateTime-1)
    - [`java.time.format.DateTimeFormatter`](README.md#javatimeformatDateTimeFormatter)
* _The Old Way_
    - [`java.util.Date`](README.md#javautilDate--1)
    - [`java.util.Calendar`](README.md#javautilCalendar--1)
    - [`java.text.DateFormat`](README.md#javatextDateFormat--1)
* [_Notes_](README.md#Notes)
    
---


[`java.time`](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html) package :+1:
-------------

- Since JDK 8 _([ThreeTen Backport](https://www.threeten.org/threetenbp/) for JDK 6 & 7)_.
- [Immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) & thread-safe.
- Value-based classes; avoid use of identity-sensitive operations!
- Classes use [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) standard chronology (aka. calendar):
    - Modern civil calendar system used today in most of the world.
    - Greatest temporal term (typically year) placed on left; successively lesser terms placed to right of previous one.
    - Equivalent to the proleptic Gregorian calendar system; today's leap year rules applied for all time.
    - Not suitable for (accurate) historical dates.
- Utilizes [Unicode Common Locale Data Repository (CLDR)](https://cldr.unicode.org/)
    - Supports world's languages and contains world's largest collection of locale data.
- Utilizes [IANA Time-Zone Database (TZDB)](http://www.iana.org/time-zones)
    - Information on every timezone change globally since 1970, with history for primary timezones since concept was introduced.
- Core classes constructed by fluent factory methods (DDD style):
    - `.of()` static factory constructs a value by its constituent fields.
    - `.from()` factory for converting from another type.
    - `.parse()` static factory method takes a string as a parameter.
    - `.with()` immutable equivalent of a setter.
    - `.get()` gets the value of something.
    - `.is()` checks if something is true.
    - `.plus()` adds an amount to an object.
    - `.minus()` subtracts an amount from an object.
    - `.to()` converts this object to another type.
    - `.at()` combines this object with another, such as date.atTime(time).
- Exchange `java.time` objects directly with database (w/ [JDBC 4.2](https://download.oracle.com/otn-pub/jcp/jdbc-4_2-mrel2-eval-spec/jdbc4.2-fr-spec.pdf)+ compliant driver); no need for strings, nor `java.sql` classes.


### [`java.time.Instant`](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) :+1:
- Stores moment as `long` seconds and `int` nanoseconds (not milliseconds) since unix epoch (UTC).


### [`java.time.Duration`](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html) :+1:
- Calculations
    - `.plusNanos()`
    - `.plusMillis()`
    - `.plusSeconds()`
    - `.plusMinutes()`
    - `.plusHours()`
    - `.plusDays()`
    - `.minusNanos()`
    - `.minusMillis()`
    - `.minusSeconds()`
    - `.minusMinutes()`
    - `.minusHours()`
    - `.minusDays()`


### [`java.time.LocalDate/Time`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) :+1:
- Ideal for dates/times in local timezone, regardless of [DST](https://en.wikipedia.org/wiki/Daylight_saving_time).
- A description of the date/time (as seen on a wall clock).
- Cannot represent an instant without additional info.
- Intended for opening & closing times; birth dates; state holidays.
- Methods
    - `.getYear()`
    - `.getMonth()`
    - `.getDayOfMonth()`
    - `.getDayOfWeek()`
    - `.getDayOfYear()`
    - `.plusDays()`
    - `.plusWeeks()`
    - `.plusMonths()`
    - `.plusYears()`
    - `.minusDays()`
    - `.minusWeeks()`
    - `.minusMonths()`
    - `.minusYears()`
    - `.getHour()`
    - `.getMinute()`
    - `.getSecond()`
    - `.getNano()`
    - `.plusHours()`
    - `.plusMinutes()`
    - `.plusSeconds()`
    - `.plusNanos()`
    - `.minusHours()`
    - `.minusMinutes()`
    - `.minusSeconds()`
    - `.minusNanos()`


### [`java.time.ZonedDateTime`](https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) :+1:
- Intended for an event time.
- Using a named timezone, rather than an offset, will handle daylight savings.
- Use a `Period` to get around daylight savings adjustments:  
  `previousDateTime.plus(Period.ofDays(3))`


### [`java.time.format.DateTimeFormatter`](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html):  :+1:

    DateTimeFormatter.BASIC_ISO_DATE.format(ZonedDateTime.now())
    // "20240205-0800"

---


### [`java.util.Date`](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html) :-1:
- Since JDK 1.0
- Mutable; Not thread-safe ⚠️
- Intended to reflect coordinated universal time (UTC).
- Wrapper around number of milliseconds ("instant") since unix epoch (UTC) but [`.toString()`](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html#toString--) displays as timezoned string (in jvm's default timezone, unintuitively, by default): ⚠️
    ```
    new Date(946684800000L)
    // Fri Dec 31 16:00:00 PST 1999
    ```
- Use [`.toGMTString()`]() to display as GMT/UTC timezoned string:
    ```
    new Date(946684800000L).toGMTString()
    // 1 Jan 2000 00:00:00 GMT
    ```
- Stores both date & time (effectively).
- `.getTime()` returns milliseconds (UTC) since unix epoch (unintuitively).
- `.setTime(long milliseconds)` mutates existing `Date` object. ⚠️
- Year is added to 1900 (unintuitively): ⚠️
    ```
    new Date(2024, 0, 1)       // Wed Jan 30 00:00:00 PST 3924
             ^^^^                                         ^^^^
    
    new Date(2024-1900, 0, 1)  // Tue Jan 30 00:00:00 PST 2024
             ^^^^^^^^^                                    ^^^^
    ```
- Month is 0 to 11. ⚠️
- Date/day is 1 to 31.
- Hour is 0 to 23.
- Minute is 0 to 59.
- Second is 0 to 61 (60 & 61 = leap seconds).
- Arguments need not fall within ranges (e.g. January 32 is interpreted as February 1):
    ```
    new Date(1970-1900, 120, 32)  // Fri Feb 01 00:00:00 PST 1980
                        ^^^  ^^          ^^^^^^              ^^^^
    ```
- [`java.sql.Date`](https://docs.oracle.com/javase/8/docs/api/java/sql/Date.html) extends `java.util.Date` and displays date (without time component) in jvm's default timezone.


### [`java.util.Calendar`](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html) :-1:
- Since JDK 1.1
- Convert between (internationalized) dates and time fields.
- Instant can be represented by millisecond value as offset from Epoch January 1, 1970 00:00:00.000 GMT (Gregorian).
- `{GregorianCalendar | Calendar.set}(year + 1900, month, date, [hrs, min[, sec]])`
- `.toInstant()`  (JDK 8+)
- `.roll()`  Increment/decrement calendar field without changing larger fields.


### [`java.text.DateFormat`](https://docs.oracle.com/javase/8/docs/api/java/text/DateFormat.html) :-1:
- Since JDK 1.1
- Not synchronized ⚠️
- Concrete class: [`java.text.SimpleDateFormat`](https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html) (not synchronized ⚠️)
- Format and parse (internationalized) date strings:
    ```
    new java.text.SimpleDateFormat("MM/dd/yy h:m a, z")
            .parse("07/10/96 4:5 PM, PDT")
    // Wed Jul 10 16:05:00 PDT 1996
    ```

---

* ⚠️ Error-prone to use `Date` or `Calendar` class with time set to midnight to represent date without a time (_midnight doesn't exist once a year in certain timezones, due to the daylight saving time cutover_).
    - JDK 7 (and below) have no standard class to represent concept of a date without a time, a time without a date, nor a duration. (try [threetenbp](https://www.threeten.org/threetenbp/))

---


Notes
-----

* Greenwich Mean Time ([GMT](https://en.wikipedia.org/wiki/Greenwich_Mean_Time)) is equivalent to Universal Time (UT):
    - GMT is the "civil" name for the standard.
    - UT is the "scientific" name for the same standard.
    - UT is based on astronomical observations.
    - UT1 is a version of UT with certain corrections applied.
    - [UTC](https://en.wikipedia.org/wiki/Coordinated_Universal_Time) is based on an atomic clock.
    - [Leap seconds](https://en.wikipedia.org/wiki/Leap_second) are introduced into UTC to keep it within 0.9 seconds of UT1.
    - Global Positioning System (GPS) synchronized to UTC but not adjusted for leap seconds.

* [Unix epoch](https://en.wikipedia.org/wiki/Unix_time) measures time by number of seconds elapsed since 00:00:00 UTC on 1 January 1970 (without leap second adjustments).

* Fractions of a second:
    |               |                             |
    |---------------|-----------------------------|
    | _millisecond_ | one thousandth of a second. |
    | _microsecond_ | one millionth of a second.  |
    | _nanosecond_  | one billionth of a second.  |
    | _picosecond_  | one trillionth of a second. |
