package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A DROP VIEW statement, as parsed from SQL.
 */
public  class DropViewStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> viewName ()  { throw new RuntimeException(); }
  public  boolean ifExists ()  { throw new RuntimeException(); }
  // not preceding
  public   DropViewStatement (scala.collection.Seq<java.lang.String> viewName, boolean ifExists)  { throw new RuntimeException(); }
}
