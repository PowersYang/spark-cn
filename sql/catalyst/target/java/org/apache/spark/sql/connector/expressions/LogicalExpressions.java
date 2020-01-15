package org.apache.spark.sql.connector.expressions;
/**
 * Helper methods for working with the logical expressions API.
 * <p>
 * Factory methods can be used when referencing the logical expression nodes is ambiguous because
 * logical and internal expressions are used.
 */
public  class LogicalExpressions {
  static public <T extends java.lang.Object> org.apache.spark.sql.connector.expressions.LiteralValue<T> literal (T value)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.apache.spark.sql.connector.expressions.LiteralValue<T> literal (T value, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.expressions.NamedReference reference (java.lang.String name)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.expressions.Transform apply (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.connector.expressions.Expression> arguments)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.expressions.BucketTransform bucket (int numBuckets, scala.collection.Seq<java.lang.String> columns)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.expressions.IdentityTransform identity (java.lang.String column)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.expressions.YearsTransform years (java.lang.String column)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.expressions.MonthsTransform months (java.lang.String column)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.expressions.DaysTransform days (java.lang.String column)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.expressions.HoursTransform hours (java.lang.String column)  { throw new RuntimeException(); }
}
