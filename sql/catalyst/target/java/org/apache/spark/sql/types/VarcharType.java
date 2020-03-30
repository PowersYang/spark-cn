package org.apache.spark.sql.types;
/**
 * Hive varchar type. Similar to other HiveStringType's, these datatypes should only used for
 * parsing, and should NOT be used anywhere else. Any instance of these data types should be
 * replaced by a {@link StringType} before analysis.
 */
public  class VarcharType extends org.apache.spark.sql.types.HiveStringType implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int length ()  { throw new RuntimeException(); }
  // not preceding
  public   VarcharType (int length)  { throw new RuntimeException(); }
  public  java.lang.String simpleString ()  { throw new RuntimeException(); }
}
