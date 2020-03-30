package org.apache.spark.sql.catalyst.plans.logical;
/**
 * ALTER VIEW ... SET TBLPROPERTIES command, as parsed from SQL.
 */
public  class AlterViewSetPropertiesStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> viewName ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterViewSetPropertiesStatement (scala.collection.Seq<java.lang.String> viewName, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
}
