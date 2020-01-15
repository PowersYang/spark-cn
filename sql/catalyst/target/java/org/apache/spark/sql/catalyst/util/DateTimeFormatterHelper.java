package org.apache.spark.sql.catalyst.util;
public  interface DateTimeFormatterHelper {
  public  java.time.ZonedDateTime toZonedDateTime (java.time.temporal.TemporalAccessor temporalAccessor, java.time.ZoneId zoneId)  ;
  public  java.time.format.DateTimeFormatter getOrCreateFormatter (java.lang.String pattern, java.util.Locale locale)  ;
}
