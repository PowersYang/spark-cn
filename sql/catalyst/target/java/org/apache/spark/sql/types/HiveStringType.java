package org.apache.spark.sql.types;
/**
 * A hive string type for compatibility. These datatypes should only used for parsing,
 * and should NOT be used anywhere else. Any instance of these data types should be
 * replaced by a {@link StringType} before analysis.
 */
public abstract class HiveStringType extends org.apache.spark.sql.types.AtomicType {
  static public  org.apache.spark.sql.types.DataType replaceCharType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  public   HiveStringType ()  { throw new RuntimeException(); }
    scala.math.Ordering<org.apache.spark.unsafe.types.UTF8String> ordering ()  { throw new RuntimeException(); }
  // not preceding
    scala.reflect.api.TypeTags.TypeTag<org.apache.spark.unsafe.types.UTF8String> tag ()  { throw new RuntimeException(); }
  public  int defaultSize ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.HiveStringType asNullable ()  { throw new RuntimeException(); }
  public abstract  int length ()  ;
}
