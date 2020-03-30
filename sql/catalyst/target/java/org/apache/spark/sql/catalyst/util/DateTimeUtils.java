package org.apache.spark.sql.catalyst.util;
/**
 * Helper functions for converting between internal and external date and time representations.
 * Dates are exposed externally as java.sql.Date and are represented internally as the number of
 * dates since the Unix epoch (1970-01-01). Timestamps are exposed externally as java.sql.Timestamp
 * and are stored internally as longs, which are capable of storing timestamps with microsecond
 * precision.
 */
public  class DateTimeUtils {
  static public final  int JULIAN_DAY_OF_EPOCH ()  { throw new RuntimeException(); }
  static public final  long NANOS_PER_MICROS ()  { throw new RuntimeException(); }
  static public final  long MICROS_PER_MILLIS ()  { throw new RuntimeException(); }
  static public final  long MILLIS_PER_SECOND ()  { throw new RuntimeException(); }
  static public final  long SECONDS_PER_DAY ()  { throw new RuntimeException(); }
  static public final  long MICROS_PER_SECOND ()  { throw new RuntimeException(); }
  static public final  long NANOS_PER_MILLIS ()  { throw new RuntimeException(); }
  static public final  long NANOS_PER_SECOND ()  { throw new RuntimeException(); }
  static public final  long MICROS_PER_DAY ()  { throw new RuntimeException(); }
  static public final  long MILLIS_PER_MINUTE ()  { throw new RuntimeException(); }
  static public final  long MILLIS_PER_HOUR ()  { throw new RuntimeException(); }
  static public final  long MILLIS_PER_DAY ()  { throw new RuntimeException(); }
  static public final  int to2001 ()  { throw new RuntimeException(); }
  static public final  int YearZero ()  { throw new RuntimeException(); }
  static public final  int toYearZero ()  { throw new RuntimeException(); }
  static public final  java.util.TimeZone TimeZoneGMT ()  { throw new RuntimeException(); }
  static public final  java.util.TimeZone TimeZoneUTC ()  { throw new RuntimeException(); }
  static public  java.lang.String TIMEZONE_OPTION ()  { throw new RuntimeException(); }
  static public  java.util.TimeZone defaultTimeZone ()  { throw new RuntimeException(); }
  static public  java.time.ZoneId getZoneId (java.lang.String timeZoneId)  { throw new RuntimeException(); }
  static public  java.util.TimeZone getTimeZone (java.lang.String timeZoneId)  { throw new RuntimeException(); }
  static public  int millisToDays (long millisUtc)  { throw new RuntimeException(); }
  static public  int millisToDays (long millisUtc, java.util.TimeZone timeZone)  { throw new RuntimeException(); }
  static public  long daysToMillis (int days)  { throw new RuntimeException(); }
  static public  long daysToMillis (int days, java.util.TimeZone timeZone)  { throw new RuntimeException(); }
  static public  java.lang.String timestampToString (org.apache.spark.sql.catalyst.util.TimestampFormatter tf, long us)  { throw new RuntimeException(); }
  /**
   * Returns the number of days since epoch from java.sql.Date.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int fromJavaDate (java.sql.Date date)  { throw new RuntimeException(); }
  /**
   * Returns a java.sql.Date from number of days since epoch.
   * @param daysSinceEpoch (undocumented)
   * @return (undocumented)
   */
  static public  java.sql.Date toJavaDate (int daysSinceEpoch)  { throw new RuntimeException(); }
  /**
   * Returns a java.sql.Timestamp from number of micros since epoch.
   * @param us (undocumented)
   * @return (undocumented)
   */
  static public  java.sql.Timestamp toJavaTimestamp (long us)  { throw new RuntimeException(); }
  /**
   * Returns the number of micros since epoch from java.sql.Timestamp.
   * @param t (undocumented)
   * @return (undocumented)
   */
  static public  long fromJavaTimestamp (java.sql.Timestamp t)  { throw new RuntimeException(); }
  /**
   * Returns the number of microseconds since epoch from Julian day
   * and nanoseconds in a day
   * @param day (undocumented)
   * @param nanoseconds (undocumented)
   * @return (undocumented)
   */
  static public  long fromJulianDay (int day, long nanoseconds)  { throw new RuntimeException(); }
  /**
   * Returns Julian day and nanoseconds in a day from the number of microseconds
   * <p>
   * Note: support timestamp since 4717 BC (without negative nanoseconds, compatible with Hive).
   * @param us (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> toJulianDay (long us)  { throw new RuntimeException(); }
  static public  long toMillis (long us)  { throw new RuntimeException(); }
  static public  long fromMillis (long millis)  { throw new RuntimeException(); }
  static public  int microsToEpochDays (long epochMicros, java.time.ZoneId zoneId)  { throw new RuntimeException(); }
  static public  long epochDaysToMicros (int epochDays, java.time.ZoneId zoneId)  { throw new RuntimeException(); }
  /**
   * Trim and parse a given UTF8 date string to the corresponding a corresponding {@link Long} value.
   * The return type is {@link Option} in order to distinguish between 0L and null. The following
   * formats are allowed:
   * <p>
   * <code>yyyy</code>
   * <code>yyyy-[m]m</code>
   * <code>yyyy-[m]m-[d]d</code>
   * <code>yyyy-[m]m-[d]d </code>
   * <code>yyyy-[m]m-[d]d [h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]</code>
   * <code>yyyy-[m]m-[d]d [h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]Z</code>
   * <code>yyyy-[m]m-[d]d [h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]-[h]h:[m]m</code>
   * <code>yyyy-[m]m-[d]d [h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]+[h]h:[m]m</code>
   * <code>yyyy-[m]m-[d]dT[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]</code>
   * <code>yyyy-[m]m-[d]dT[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]Z</code>
   * <code>yyyy-[m]m-[d]dT[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]-[h]h:[m]m</code>
   * <code>yyyy-[m]m-[d]dT[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]+[h]h:[m]m</code>
   * <code>[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]</code>
   * <code>[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]Z</code>
   * <code>[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]-[h]h:[m]m</code>
   * <code>[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]+[h]h:[m]m</code>
   * <code>T[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]</code>
   * <code>T[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]Z</code>
   * <code>T[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]-[h]h:[m]m</code>
   * <code>T[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]+[h]h:[m]m</code>
   * @param s (undocumented)
   * @param timeZoneId (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.Object> stringToTimestamp (org.apache.spark.unsafe.types.UTF8String s, java.time.ZoneId timeZoneId)  { throw new RuntimeException(); }
  static public  long instantToMicros (java.time.Instant instant)  { throw new RuntimeException(); }
  static public  java.time.Instant microsToInstant (long us)  { throw new RuntimeException(); }
  static public  int instantToDays (java.time.Instant instant)  { throw new RuntimeException(); }
  static public  int localDateToDays (java.time.LocalDate localDate)  { throw new RuntimeException(); }
  static public  java.time.LocalDate daysToLocalDate (int days)  { throw new RuntimeException(); }
  /**
   * Trim and parse a given UTF8 date string to a corresponding {@link Int} value.
   * The return type is {@link Option} in order to distinguish between 0 and null. The following
   * formats are allowed:
   * <p>
   * <code>yyyy</code>
   * <code>yyyy-[m]m</code>
   * <code>yyyy-[m]m-[d]d</code>
   * <code>yyyy-[m]m-[d]d </code>
   * <code>yyyy-[m]m-[d]d *</code>
   * <code>yyyy-[m]m-[d]dT*</code>
   * @param s (undocumented)
   * @param zoneId (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.Object> stringToDate (org.apache.spark.unsafe.types.UTF8String s, java.time.ZoneId zoneId)  { throw new RuntimeException(); }
  /**
   * Returns the hour value of a given timestamp value. The timestamp is expressed in microseconds.
   * @param microsec (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  int getHours (long microsec, java.util.TimeZone timeZone)  { throw new RuntimeException(); }
  /**
   * Returns the minute value of a given timestamp value. The timestamp is expressed in
   * microseconds.
   * @param microsec (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  int getMinutes (long microsec, java.util.TimeZone timeZone)  { throw new RuntimeException(); }
  /**
   * Returns the second value of a given timestamp value. The timestamp is expressed in
   * microseconds.
   * @param microsec (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  int getSeconds (long microsec, java.util.TimeZone timeZone)  { throw new RuntimeException(); }
  /**
   * Returns the seconds part and its fractional part with microseconds.
   * @param microsec (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.Decimal getSecondsWithFraction (long microsec, java.util.TimeZone timeZone)  { throw new RuntimeException(); }
  /**
   * Returns seconds, including fractional parts, multiplied by 1000. The timestamp
   * is expressed in microseconds since the epoch.
   * @param timestamp (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.Decimal getMilliseconds (long timestamp, java.util.TimeZone timeZone)  { throw new RuntimeException(); }
  /**
   * Returns seconds, including fractional parts, multiplied by 1000000. The timestamp
   * is expressed in microseconds since the epoch.
   * @param timestamp (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  int getMicroseconds (long timestamp, java.util.TimeZone timeZone)  { throw new RuntimeException(); }
  /**
   * Returns the 'day in year' value for the given date. The date is expressed in days
   * since 1.1.1970.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getDayInYear (int date)  { throw new RuntimeException(); }
  /** Returns the millennium for the given date. The date is expressed in days since 1.1.1970. */
  static public  int getMillennium (int date)  { throw new RuntimeException(); }
  /** Returns the century for the given date. The date is expressed in days since 1.1.1970. */
  static public  int getCentury (int date)  { throw new RuntimeException(); }
  /** Returns the decade for the given date. The date is expressed in days since 1.1.1970. */
  static public  int getDecade (int date)  { throw new RuntimeException(); }
  /**
   * Returns the year value for the given date. The date is expressed in days
   * since 1.1.1970.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getYear (int date)  { throw new RuntimeException(); }
  /**
   * Returns the year which conforms to ISO 8601. Each ISO 8601 week-numbering
   * year begins with the Monday of the week containing the 4th of January.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getIsoYear (int date)  { throw new RuntimeException(); }
  /**
   * Returns the quarter for the given date. The date is expressed in days
   * since 1.1.1970.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getQuarter (int date)  { throw new RuntimeException(); }
  /**
   * Split date (expressed in days since 1.1.1970) into four fields:
   * year, month (Jan is Month 1), dayInMonth, daysToMonthEnd (0 if it's last day of month).
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> splitDate (int date)  { throw new RuntimeException(); }
  /**
   * Returns the month value for the given date. The date is expressed in days
   * since 1.1.1970. January is month 1.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getMonth (int date)  { throw new RuntimeException(); }
  /**
   * Returns the 'day of month' value for the given date. The date is expressed in days
   * since 1.1.1970.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getDayOfMonth (int date)  { throw new RuntimeException(); }
  /**
   * Add date and year-month interval.
   * Returns a date value, expressed in days since 1.1.1970.
   * @param days (undocumented)
   * @param months (undocumented)
   * @return (undocumented)
   */
  static public  int dateAddMonths (int days, int months)  { throw new RuntimeException(); }
  /**
   * Add timestamp and full interval.
   * Returns a timestamp value, expressed in microseconds since 1.1.1970 00:00:00.
   * @param start (undocumented)
   * @param months (undocumented)
   * @param days (undocumented)
   * @param microseconds (undocumented)
   * @param zoneId (undocumented)
   * @return (undocumented)
   */
  static public  long timestampAddInterval (long start, int months, int days, long microseconds, java.time.ZoneId zoneId)  { throw new RuntimeException(); }
  /**
   * Returns number of months between time1 and time2. time1 and time2 are expressed in
   * microseconds since 1.1.1970. If time1 is later than time2, the result is positive.
   * <p>
   * If time1 and time2 are on the same day of month, or both are the last day of month,
   * returns, time of day will be ignored.
   * <p>
   * Otherwise, the difference is calculated based on 31 days per month.
   * The result is rounded to 8 decimal places if <code>roundOff</code> is set to true.
   * @param time1 (undocumented)
   * @param time2 (undocumented)
   * @param roundOff (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  double monthsBetween (long time1, long time2, boolean roundOff, java.util.TimeZone timeZone)  { throw new RuntimeException(); }
  static public  int getDayOfWeekFromString (org.apache.spark.unsafe.types.UTF8String string)  { throw new RuntimeException(); }
  /**
   * Returns the first date which is later than startDate and is of the given dayOfWeek.
   * dayOfWeek is an integer ranges in [0, 6], and 0 is Thu, 1 is Fri, etc,.
   * @param startDate (undocumented)
   * @param dayOfWeek (undocumented)
   * @return (undocumented)
   */
  static public  int getNextDateForDayOfWeek (int startDate, int dayOfWeek)  { throw new RuntimeException(); }
  /**
   * Returns last day of the month for the given date. The date is expressed in days
   * since 1.1.1970.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getLastDayOfMonth (int date)  { throw new RuntimeException(); }
  static   int TRUNC_INVALID ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_MICROSECOND ()  { throw new RuntimeException(); }
  static   int MIN_LEVEL_OF_TIMESTAMP_TRUNC ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_MILLISECOND ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_SECOND ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_MINUTE ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_HOUR ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_DAY ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_WEEK ()  { throw new RuntimeException(); }
  static   int MIN_LEVEL_OF_DATE_TRUNC ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_MONTH ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_QUARTER ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_YEAR ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_DECADE ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_CENTURY ()  { throw new RuntimeException(); }
  static   int TRUNC_TO_MILLENNIUM ()  { throw new RuntimeException(); }
  /**
   * Returns the trunc date from original date and trunc level.
   * Trunc level should be generated using <code>parseTruncLevel()</code>, should be between 0 and 6.
   * @param d (undocumented)
   * @param level (undocumented)
   * @return (undocumented)
   */
  static public  int truncDate (int d, int level)  { throw new RuntimeException(); }
  /**
   * Returns the trunc date time from original date time and trunc level.
   * Trunc level should be generated using <code>parseTruncLevel()</code>, should be between 0 and 12.
   * @param t (undocumented)
   * @param level (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  long truncTimestamp (long t, int level, java.util.TimeZone timeZone)  { throw new RuntimeException(); }
  /**
   * Returns the truncate level, could be from TRUNC_TO_MICROSECOND to TRUNC_TO_MILLENNIUM,
   * or TRUNC_INVALID, TRUNC_INVALID means unsupported truncate level.
   * @param format (undocumented)
   * @return (undocumented)
   */
  static public  int parseTruncLevel (org.apache.spark.unsafe.types.UTF8String format)  { throw new RuntimeException(); }
  /**
   * Lookup the offset for given millis seconds since 1970-01-01 00:00:00 in given timezone.
   * TODO: Improve handling of normalization differences.
   * TODO: Replace with JSR-310 or similar system - see SPARK-16788
   * @param millisLocal (undocumented)
   * @param tz (undocumented)
   * @return (undocumented)
   */
  static   long getOffsetFromLocalMillis (long millisLocal, java.util.TimeZone tz)  { throw new RuntimeException(); }
  /**
   * Convert the timestamp <code>ts</code> from one timezone to another.
   * <p>
   * TODO: Because of DST, the conversion between UTC and human time is not exactly one-to-one
   * mapping, the conversion here may return wrong result, we should make the timestamp
   * timezone-aware.
   * @param ts (undocumented)
   * @param fromZone (undocumented)
   * @param toZone (undocumented)
   * @return (undocumented)
   */
  static public  long convertTz (long ts, java.util.TimeZone fromZone, java.util.TimeZone toZone)  { throw new RuntimeException(); }
  /**
   * Returns a timestamp of given timezone from utc timestamp, with the same string
   * representation in their timezone.
   * @param time (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  long fromUTCTime (long time, java.lang.String timeZone)  { throw new RuntimeException(); }
  /**
   * Returns a utc timestamp from a given timestamp from a given timezone, with the same
   * string representation in their timezone.
   * @param time (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  long toUTCTime (long time, java.lang.String timeZone)  { throw new RuntimeException(); }
  /**
   * Returns the number of seconds with fractional part in microsecond precision
   * since 1970-01-01 00:00:00 local time.
   * @param timestamp (undocumented)
   * @param zoneId (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.Decimal getEpoch (long timestamp, java.time.ZoneId zoneId)  { throw new RuntimeException(); }
  static public  long currentTimestamp ()  { throw new RuntimeException(); }
  static public  int currentDate (java.time.ZoneId zoneId)  { throw new RuntimeException(); }
  /**
   * Converts notational shorthands that are converted to ordinary timestamps.
   * @param input - a trimmed string
   * @param zoneId - zone identifier used to get the current date.
   * @return some of microseconds since the epoch if the conversion completed
   *         successfully otherwise None.
   */
  static public  scala.Option<java.lang.Object> convertSpecialTimestamp (java.lang.String input, java.time.ZoneId zoneId)  { throw new RuntimeException(); }
  /**
   * Converts notational shorthands that are converted to ordinary dates.
   * @param input - a trimmed string
   * @param zoneId - zone identifier used to get the current date.
   * @return some of days since the epoch if the conversion completed successfully otherwise None.
   */
  static public  scala.Option<java.lang.Object> convertSpecialDate (java.lang.String input, java.time.ZoneId zoneId)  { throw new RuntimeException(); }
  /**
   * Subtracts two dates.
   * @param endDate - the end date, exclusive
   * @param startDate - the start date, inclusive
   * @return an interval between two dates. The interval can be negative
   *         if the end date is before the start date.
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval subtractDates (int endDate, int startDate)  { throw new RuntimeException(); }
}
