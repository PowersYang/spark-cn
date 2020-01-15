package org.apache.spark.sql.catalyst.util;
public  class IntervalUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final IntervalUtils$ MODULE$ = null;
  public   IntervalUtils$ ()  { throw new RuntimeException(); }
  public final  int MONTHS_PER_YEAR ()  { throw new RuntimeException(); }
  public final  byte MONTHS_PER_QUARTER ()  { throw new RuntimeException(); }
  public final  int YEARS_PER_MILLENNIUM ()  { throw new RuntimeException(); }
  public final  int YEARS_PER_CENTURY ()  { throw new RuntimeException(); }
  public final  int YEARS_PER_DECADE ()  { throw new RuntimeException(); }
  public final  long MICROS_PER_HOUR ()  { throw new RuntimeException(); }
  public final  long MICROS_PER_MINUTE ()  { throw new RuntimeException(); }
  public final  byte DAYS_PER_MONTH ()  { throw new RuntimeException(); }
  public final  long MICROS_PER_MONTH ()  { throw new RuntimeException(); }
  public final  long MICROS_PER_YEAR ()  { throw new RuntimeException(); }
  public  int getYears (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  int getMillenniums (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  int getCenturies (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  int getDecades (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  byte getMonths (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  byte getQuarters (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  int getDays (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  long getHours (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  byte getMinutes (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  long getMicroseconds (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Decimal getSeconds (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Decimal getMilliseconds (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Decimal getEpoch (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  /**
   * Converts a string to {@link CalendarInterval} case-insensitively.
   * <p>
   * @throws IllegalArgumentException if the input string is not in valid interval format.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.unsafe.types.CalendarInterval fromString (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * A safe version of <code>fromString</code>. It returns null for invalid input string.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.unsafe.types.CalendarInterval safeFromString (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Parse YearMonth string in form: [+|-]YYYY-MM
   * <p>
   * adapted from HiveIntervalYearMonth.valueOf
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.unsafe.types.CalendarInterval fromYearMonthString (java.lang.String input)  { throw new RuntimeException(); }
  /**
   * Parse dayTime string in form: [-]d HH:mm:ss.nnnnnnnnn and [-]HH:mm:ss.nnnnnnnnn
   * <p>
   * adapted from HiveIntervalDayTime.valueOf
   * @param s (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.unsafe.types.CalendarInterval fromDayTimeString (java.lang.String s)  { throw new RuntimeException(); }
  /**
   * Parse dayTime string in form: [-]d HH:mm:ss.nnnnnnnnn and [-]HH:mm:ss.nnnnnnnnn
   * <p>
   * adapted from HiveIntervalDayTime.valueOf.
   * Below interval conversion patterns are supported:
   * - DAY TO (HOUR|MINUTE|SECOND)
   * - HOUR TO (MINUTE|SECOND)
   * - MINUTE TO SECOND
   * @param input (undocumented)
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.unsafe.types.CalendarInterval fromDayTimeString (java.lang.String input, java.lang.String from, java.lang.String to)  { throw new RuntimeException(); }
  public  org.apache.spark.unsafe.types.CalendarInterval fromUnitStrings (java.lang.String[] units, java.lang.String[] values)  { throw new RuntimeException(); }
  /**
   * Gets interval duration
   * <p>
   * @param interval The interval to get duration
   * @param targetUnit Time units of the result
   * @param daysPerMonth The number of days per one month. The default value is 31 days
   *                     per month. This value was taken as the default because it is used
   *                     in Structured Streaming for watermark calculations. Having 31 days
   *                     per month, we can guarantee that events are not dropped before
   *                     the end of any month (February with 29 days or January with 31 days).
   * @return Duration in the specified time units
   */
  public  long getDuration (org.apache.spark.unsafe.types.CalendarInterval interval, java.util.concurrent.TimeUnit targetUnit, int daysPerMonth)  { throw new RuntimeException(); }
  /**
   * Checks the interval is negative
   * <p>
   * @param interval The checked interval
   * @param daysPerMonth The number of days per one month. The default value is 31 days
   *                     per month. This value was taken as the default because it is used
   *                     in Structured Streaming for watermark calculations. Having 31 days
   *                     per month, we can guarantee that events are not dropped before
   *                     the end of any month (February with 29 days or January with 31 days).
   * @return true if duration of the given interval is less than 0 otherwise false
   */
  public  boolean isNegative (org.apache.spark.unsafe.types.CalendarInterval interval, int daysPerMonth)  { throw new RuntimeException(); }
}
