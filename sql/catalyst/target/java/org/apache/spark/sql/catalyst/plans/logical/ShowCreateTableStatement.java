package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A SHOW CREATE TABLE statement, as parsed from SQL.
 */
public  class ShowCreateTableStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowCreateTableStatement (scala.collection.Seq<java.lang.String> tableName)  { throw new RuntimeException(); }
}
