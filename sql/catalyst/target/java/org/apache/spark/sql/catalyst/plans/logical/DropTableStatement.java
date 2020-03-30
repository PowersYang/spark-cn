package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A DROP TABLE statement, as parsed from SQL.
 */
public  class DropTableStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  boolean ifExists ()  { throw new RuntimeException(); }
  public  boolean purge ()  { throw new RuntimeException(); }
  // not preceding
  public   DropTableStatement (scala.collection.Seq<java.lang.String> tableName, boolean ifExists, boolean purge)  { throw new RuntimeException(); }
}
