package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A SHOW COLUMNS statement, as parsed from SQL
 */
public  class ShowColumnsStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> table ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> namespace ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowColumnsStatement (scala.collection.Seq<java.lang.String> table, scala.Option<scala.collection.Seq<java.lang.String>> namespace)  { throw new RuntimeException(); }
}
