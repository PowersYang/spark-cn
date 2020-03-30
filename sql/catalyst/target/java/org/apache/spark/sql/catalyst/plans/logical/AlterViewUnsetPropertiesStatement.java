package org.apache.spark.sql.catalyst.plans.logical;
/**
 * ALTER VIEW ... UNSET TBLPROPERTIES command, as parsed from SQL.
 */
public  class AlterViewUnsetPropertiesStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> viewName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> propertyKeys ()  { throw new RuntimeException(); }
  public  boolean ifExists ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterViewUnsetPropertiesStatement (scala.collection.Seq<java.lang.String> viewName, scala.collection.Seq<java.lang.String> propertyKeys, boolean ifExists)  { throw new RuntimeException(); }
}
