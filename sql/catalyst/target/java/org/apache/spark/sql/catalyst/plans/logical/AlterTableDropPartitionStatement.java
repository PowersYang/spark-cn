package org.apache.spark.sql.catalyst.plans.logical;
/**
 * ALTER TABLE ... DROP PARTITION command, as parsed from SQL
 */
public  class AlterTableDropPartitionStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs ()  { throw new RuntimeException(); }
  public  boolean ifExists ()  { throw new RuntimeException(); }
  public  boolean purge ()  { throw new RuntimeException(); }
  public  boolean retainData ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterTableDropPartitionStatement (scala.collection.Seq<java.lang.String> tableName, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs, boolean ifExists, boolean purge, boolean retainData)  { throw new RuntimeException(); }
}
