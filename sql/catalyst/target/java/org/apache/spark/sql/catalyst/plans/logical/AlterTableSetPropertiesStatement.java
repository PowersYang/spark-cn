package org.apache.spark.sql.catalyst.plans.logical;
/**
 * ALTER TABLE ... SET TBLPROPERTIES command, as parsed from SQL.
 */
public  class AlterTableSetPropertiesStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterTableSetPropertiesStatement (scala.collection.Seq<java.lang.String> tableName, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
}
