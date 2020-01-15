package org.apache.spark.sql.catalyst.plans.logical;
/**
 * ALTER TABLE ... SET LOCATION command, as parsed from SQL.
 */
public  class AlterTableSetLocationStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partitionSpec ()  { throw new RuntimeException(); }
  public  java.lang.String location ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterTableSetLocationStatement (scala.collection.Seq<java.lang.String> tableName, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partitionSpec, java.lang.String location)  { throw new RuntimeException(); }
}
