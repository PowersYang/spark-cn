package org.apache.spark.sql.execution.command;
public  class UncacheTableCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.RunnableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier tableIdent ()  { throw new RuntimeException(); }
  public  boolean ifExists ()  { throw new RuntimeException(); }
  // not preceding
  public   UncacheTableCommand (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, boolean ifExists)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}
