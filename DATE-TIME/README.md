📆 Java Date & Time
===================

* _The New Way_ ([`java.time`](README.md#javatime-package))
    - [`java.time.Instant`](README.md#javatimeInstant)
    - [`java.time.Duration`](README.md#javatimeDuration)
    - [`java.time.LocalDate/Time`](README.md#javatimeLocalDateTime)
    - [`java.time.ZonedDateTime`](README.md#javatimeZonedDateTime)
    - [`java.time.format.DateTimeFormatter`](README.md#javatimeformatDateTimeFormatter)
* _The Old Way_
    - [`java.util.Date`](README.md#javautilDate)
    - [`java.util.Calendar`](README.md#javautilCalendar)
    - [`java.text.DateFormat`](README.md#javatestDateFormat)
* [_Notes_](README.md#Notes)
    
---


[`java.time`](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html) package
-------------

- Since jdk 8 ([ThreeTen Backport](https://www.threeten.org/threetenbp/) for jdk 6 & 7).
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


### [`java.time.Instant`](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html)
- Stores moment as `long` seconds and `int` nanoseconds (not milliseconds) since unix epoch (UTC).


### [`java.time.Duration`](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html)
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


### [`java.time.LocalDate/Time`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)
- Ideal for dates/times in local timezone, regardless of [DST](https://en.wikipedia.org/wiki/Daylight_saving_time).
- A description of the date/time (as seen on a wall clock).
- Cannot represent an instance without additional info.
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


### [`java.time.ZonedDateTime`](https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)
- Intended for an event time.
- Using a named timezone, rather than an offset, will handle daylight savings.
- Use a `Period` to get around daylight savings adjustments:
    `previousDateTime.plus(Period.ofDays(3))`


### [`java.time.format.DateTimeFormatter`](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)

    DateTimeFormatter.BASIC_ISO_DATE.format(ZonedDateTime.now())
    // "20240205-0800"

---


### [`java.util.Date`](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html) (jdk 1.0; ***not thread-safe*** ⚠️)
- `java.sql.Date` (extends `java.util.Date`) displays date (as effectively midnight) in jvm's default timezone.
- Instant on (UTC) timeline.
- Wrapper around number of milliseconds since unix epoch but `.toString()` displays as timezoned string (in jvm's default timezone, unintuitively, by default) ⚠️.

      new java.util.Date(946684800000L)
      // Fri Dec 31 16:00:00 PST 1999
      new java.util.Date(946684800000L).toGMTString()
      // 1 Jan 2000 00:00:00 GMT
- `.getTime()` returns milliseconds (UTC) since unix epoch (unintuitively).
- `.setTime(long milliseconds)` mutates existing `Date` object. ⚠️
- Intended to reflect coordinated universal time (UTC).
- Stores UTC milliseconds offset since epoch.
- Stores both date & time (effectively).
- Year is added to 1900: ⚠️

        new Date(2024, 0, 30)
        // Wed Jan 30 00:00:00 PST 3924
        new Date(2024-1900, 0, 30)
        // Tue Jan 30 00:00:00 PST 2024
- Month is 0 to 11. ⚠️
- Date/day is 1 to 31.
- Hour is 0 to 23.
- Minute is 0 to 59.
- Second is 0 to 61 (60 & 61 = leap seconds).
- Arguments need not fall within ranges (e.g. January 32 is interpreted as February 1):

        new Date(1970-1900, 0, 1)
        // Thu Jan 01 00:00:00 PST 1970
        new Date(1970-1900, 120, 1)
        // Tue Jan 01 00:00:00 PST 1980


### [`java.util.Calendar`](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html) (jdk 1.1)
- Convert between (internationalized) dates and time fields.
- Instant can be represented by millisecond value as offset from Epoch January 1, 1970 00:00:00.000 GMT (Gregorian).
- `{GregorianCalendar | Calendar.set}(year + 1900, month, date, [hrs, min[, sec]])`
- `.toInstant()`  (jdk 8)
- `.roll()`  Increment/decrement calendar field without changing larger fields.


### [`java.text.DateFormat`](https://docs.oracle.com/javase/8/docs/api/java/text/DateFormat.html) (jdk 1.1; not synchronized ⚠️)
- [`java.text.SimpleDateFormat`](https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html) (not synchronized ⚠️)
- Format and parse (internationalized) date strings.

      new java.text.SimpleDateFormat("MM/dd/yy h:m a, z").parse("07/10/96 4:5 PM, PDT")
      // Wed Jul 10 16:05:00 PDT 1996

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
