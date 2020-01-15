package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A DROP NAMESPACE statement, as parsed from SQL.
 */
public  class DropNamespaceStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> namespace ()  { throw new RuntimeException(); }
  public  boolean ifExists ()  { throw new RuntimeException(); }
  public  boolean cascade ()  { throw new RuntimeException(); }
  // not preceding
  public   DropNamespaceStatement (scala.collection.Seq<java.lang.String> namespace, boolean ifExists, boolean cascade)  { throw new RuntimeException(); }
}
