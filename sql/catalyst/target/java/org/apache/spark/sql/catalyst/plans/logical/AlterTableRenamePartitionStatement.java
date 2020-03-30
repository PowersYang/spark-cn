package org.apache.spark.sql.catalyst.plans.logical;
/**
 * ALTER TABLE ... RENAME PARTITION command, as parsed from SQL.
 */
public  class AlterTableRenamePartitionStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> from ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> to ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterTableRenamePartitionStatement (scala.collection.Seq<java.lang.String> tableName, scala.collection.immutable.Map<java.lang.String, java.lang.String> from, scala.collection.immutable.Map<java.lang.String, java.lang.String> to)  { throw new RuntimeException(); }
}
