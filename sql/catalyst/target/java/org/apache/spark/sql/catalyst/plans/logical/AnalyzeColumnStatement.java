package org.apache.spark.sql.catalyst.plans.logical;
/**
 * An ANALYZE TABLE FOR COLUMNS statement, as parsed from SQL.
 */
public  class AnalyzeColumnStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> columnNames ()  { throw new RuntimeException(); }
  public  boolean allColumns ()  { throw new RuntimeException(); }
  // not preceding
  public   AnalyzeColumnStatement (scala.collection.Seq<java.lang.String> tableName, scala.Option<scala.collection.Seq<java.lang.String>> columnNames, boolean allColumns)  { throw new RuntimeException(); }
}
