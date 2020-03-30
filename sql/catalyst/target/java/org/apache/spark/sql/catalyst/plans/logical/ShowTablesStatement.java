package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A SHOW TABLES statement, as parsed from SQL.
 */
public  class ShowTablesStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> namespace ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> pattern ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowTablesStatement (scala.Option<scala.collection.Seq<java.lang.String>> namespace, scala.Option<java.lang.String> pattern)  { throw new RuntimeException(); }
}
