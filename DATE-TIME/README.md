📆 Java Date & Time
===================

_The New Way_ 🤓
-------------

<details>
<summary><h3><code>java.time</code> package :+1:</h3></summary>

- [Tutorial](https://docs.oracle.com/javase/tutorial/datetime/TOC.html); [API Docs](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html)
- Since JDK 8 _([ThreeTen Backport](https://www.threeten.org/threetenbp/) for JDK 6 & 7)_.
- [Immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) & thread-safe.
- Value-based classes; avoid use of identity-sensitive operations!  
  Equals _method (not symbol)_ should be used for comparisons.
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
    - `.from()` static factory for converting from another type (may lose info from input).
    - `.parse()` static factory method takes a string as a parameter.
    - `.with()` copy of object with one element changed (immutable equivalent of a setter).
    - `.get()` gets the value of something.
    - `.is()` checks if something is true.
    - `.plus()` copy of object with amount added.
    - `.minus()` copy of object with amount subtracted.
    - `.to()` converts this object to object of another type.
    - `.at()` combines this object with another, such as date.atTime(time).
- Exchange `java.time` objects directly with database (w/ [JDBC 4.2](https://download.oracle.com/otn-pub/jcp/jdbc-4_2-mrel2-eval-spec/jdbc4.2-fr-spec.pdf)+ compliant driver); no need for strings, nor `java.sql` classes.
</details>


<details>
<summary><h3><code>java.time.Instant</code> :+1:</h3></summary>

- [Tutorial](https://docs.oracle.com/javase/tutorial/datetime/iso/instant.html); [API Doc](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html)
- Stores moment as `long` seconds, and `int` nanoseconds (0 to 999,999,999), since Unix epoch (UTC).
- Instants before epoch have negative seconds. _(nanoseconds are always positive)_
- Ideal for recording event timestamps in application.
</details>


<details>
<summary><h3><code>java.time.Duration</code></a> :+1:</h3></summary>

- [Tutorial](https://docs.oracle.com/javase/tutorial/datetime/iso/period.html); [API Doc](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html)
- Models a quantity of time in seconds and nanoseconds.
- `DAYS` unit (equal to 24 hours) can be used to ignore daylight savings effects.
- `Period` is the date-based equivalent to a `Duration`.
- A physical duration could be of infinite length.
- Stored with constraints similar to `Instant`.
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
</details>


<details>
<summary><h3><code>java.time.LocalDate/Time</code> :+1:</h3></summary>

- [Tutorial](https://docs.oracle.com/javase/tutorial/datetime/iso/datetime.html); [API Doc](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)
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
</details>


<details>
<summary><h3><code>java.time.OffsetDateTime</code> :+1:</h3></summary>

- [Tutorial](https://docs.oracle.com/javase/tutorial/datetime/iso/timezones.html); [API Doc](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)
- Allows the `LocalDateTime` to be obtained by adding offset from UTC/GMT to an instant.
- Doesn't add full timezone rules. (`ZonedDateTime` does)
- `ZonedDateTime` and `Instant` are intended to model data in simpler applications.
</details>


<details>
<summary><h3><code>java.time.ZonedDateTime</code> :+1:</h3></summary>

- [Tutorial](https://docs.oracle.com/javase/tutorial/datetime/iso/timezones.html); [API Doc](https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)
- Intended for an event time.
- Using a named timezone, rather than an offset, will handle daylight savings.
- Use a `Period` to allow for (conceptual) daylight savings adjustments in calculations:  
  `previousDateTime.plus(Period.ofDays(3))`
- Use a `Duration` to add an exact number of seconds (ie. a day is always 24 hours; no DST adjustment).
</details>


<details>
<summary><h3><code>java.time.format.DateTimeFormatter</code> :+1:</h3></summary>

- [Tutorial](https://docs.oracle.com/javase/tutorial/datetime/iso/format.html); [API Doc](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)

      DateTimeFormatter.BASIC_ISO_DATE.format(ZonedDateTime.now())
      // "20240205-0800"
</details>

---

<table>
  <caption>
    Interfaces Implemented by Class:
  </caption>
  <thead>
    <tr>
      <th></th>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/temporal/Temporal.html">
        <code>Temporal</code>
      </a></th>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAccessor.html">
        <code>TemporalAccessor</code>
      </a></th>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAdjuster.html">
        <code>TemporalAdjuster</code>
      </a></th>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAmount.html">
        <code>TemporalAmount</code>
      </a></th>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/chrono/ChronoPeriod.html">
        <code>ChronoPeriod</code>
      </a></th>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/chrono/ChronoLocalDateTime.html">
        <code>ChronoLocalDateTime</code>
      </a></th>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/chrono/ChronoZonedDateTime.html">
        <code>ChronoZonedDateTime</code>
      </a></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html">
        <code>Instant</code>
      </a></th>
      <td>x</td>
      <td>x</td>
      <td>x</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html">
        <code>Duration</code>
      </a></th>
      <td></td>
      <td></td>
      <td></td>
      <td>x</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/Period.html">
        <code>Period</code>
      </a></th>
      <td></td>
      <td></td>
      <td></td>
      <td>x</td>
      <td>x</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html">
        <code>LocalDateTime</th>
      </a></th>
      <td>x</td>
      <td>x</td>
      <td>x</td>
      <td></td>
      <td></td>
      <td>x</td>
      <td></td>
    </tr>
    <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html">
        <code>OffsetDateTime</th>
      </a></th>
      <td>x</td>
      <td>x</td>
      <td>x</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
  <th><a href="https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html">
        <code>ZonedDateTime</th>
      </a></th>
      <td>x</td>
      <td>x</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td>x</td>
    </tr>
</table>

---

_The Old Way_ 🤬
-------------

<details>
<summary><h3><code>java.util.Date</code> :-1:</h3></summary>

- [Tutorial](https://docs.oracle.com/javase/tutorial/datetime/iso/legacy.html); [API Doc](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)
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
    new Date(2024, 0, 1)       // Tue Jan 01 00:00:00 PST 3924
             ^^^^                                         ^^^^
    
    new Date(2024-1900, 0, 1)  // Mon Jan 01 00:00:00 PST 2024
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
</details>


<details>
<summary><h3><code>java.util.Calendar</code> :-1:</h3></summary>

- [Tutorial](https://docs.oracle.com/javase/tutorial/datetime/iso/legacy.html); [API Doc](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html)
- Since JDK 1.1
- Convert between (internationalized) dates and time fields.
- Instant can be represented by millisecond value as offset from Epoch January 1, 1970 00:00:00.000 GMT (Gregorian).
- `{GregorianCalendar | Calendar.set}(year + 1900, month, date, [hrs, min[, sec]])`
- `.toInstant()`  (JDK 8+)
- `.roll()`  Increment/decrement calendar field without changing larger fields.
</details>


<details>
<summary><h3><code>java.text.DateFormat</code> :-1:</h3></summary>

- [Tutorial](https://docs.oracle.com/javase/tutorial/datetime/iso/legacy.html); [API Doc](https://docs.oracle.com/javase/8/docs/api/java/text/DateFormat.html)
- Since JDK 1.1
- Not synchronized ⚠️
- Concrete class: [`java.text.SimpleDateFormat`](https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html) (not synchronized ⚠️)
- Format and parse (internationalized) date strings:
    ```
    new java.text.SimpleDateFormat("MM/dd/yy h:m a, z")
            .parse("07/10/96 4:5 PM, PDT")
    // Wed Jul 10 16:05:00 PDT 1996
    ```
</details>


---

* ⚠️ Error-prone to use `Date` or `Calendar` class with time set to midnight to represent date without a time (_midnight doesn't exist once a year in certain timezones, due to the daylight saving time cutover_).
    - JDK 7 (and below) have no standard class to represent concept of a date without a time, a time without a date, nor a duration. (try [threetenbp](https://www.threeten.org/threetenbp/))

---


Notes
-----

* Greenwich Mean Time ([GMT](https://en.wikipedia.org/wiki/Greenwich_Mean_Time)) is equivalent to Universal Time (UT):
    - GMT is the "[civil](https://en.wikipedia.org/wiki/Civil_time)" name for the standard.
    - UT is the "scientific" name for the same standard.
    - [UT](https://en.wikipedia.org/wiki/Universal_Time) is based on astronomical observations.
    - UT1 is a version of UT corrected for [polar motion](https://en.wikipedia.org/wiki/Polar_motion).
    - [UTC](https://en.wikipedia.org/wiki/Coordinated_Universal_Time) is based on an atomic clock.
    - [Leap seconds](https://en.wikipedia.org/wiki/Leap_second) are introduced into UTC to keep it within 0.9 seconds of UT1.
    - [GPS time](https://en.wikipedia.org/wiki/Global_Positioning_System#Timekeeping)
        - Epoch: 00:00:00 UTC (00:00:19 [TAI](https://en.wikipedia.org/wiki/International_Atomic_Time)) on January 6, 1980.
        - Not adjusted for leap seconds.
        - Ahead of UTC by 18 seconds (as of leap second added to UTC on December 31, 2016).
        - Date expressed as week number & seconds-into-week number.
        - Week number transmitted as 10-bit field (becomes zero again every 1,024 weeks [19.6 years]).
    - [Unix epoch](https://en.wikipedia.org/wiki/Unix_time)
        -  Number of seconds elapsed since 00:00:00 UTC on 1 January 1970 (without leap second adjustments).

* Fractions of a second:
    |               |                             |
    |---------------|-----------------------------|
    | _millisecond_ | one thousandth of a second. |
    | _microsecond_ | one millionth of a second.  |
    | _nanosecond_  | one billionth of a second.  |
    | _picosecond_  | one trillionth of a second. |
