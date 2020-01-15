package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A DESCRIBE TABLE tbl_name col_name statement, as parsed from SQL.
 */
public  class DescribeColumnStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> colNameParts ()  { throw new RuntimeException(); }
  public  boolean isExtended ()  { throw new RuntimeException(); }
  // not preceding
  public   DescribeColumnStatement (scala.collection.Seq<java.lang.String> tableName, scala.collection.Seq<java.lang.String> colNameParts, boolean isExtended)  { throw new RuntimeException(); }
}
