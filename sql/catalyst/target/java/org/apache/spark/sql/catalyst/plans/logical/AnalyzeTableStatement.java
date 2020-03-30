package org.apache.spark.sql.catalyst.plans.logical;
/**
 * An ANALYZE TABLE statement, as parsed from SQL.
 */
public  class AnalyzeTableStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partitionSpec ()  { throw new RuntimeException(); }
  public  boolean noScan ()  { throw new RuntimeException(); }
  // not preceding
  public   AnalyzeTableStatement (scala.collection.Seq<java.lang.String> tableName, scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partitionSpec, boolean noScan)  { throw new RuntimeException(); }
}
