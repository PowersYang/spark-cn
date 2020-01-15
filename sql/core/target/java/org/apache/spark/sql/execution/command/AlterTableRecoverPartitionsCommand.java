package org.apache.spark.sql.execution.command;
/**
 * Recover Partitions in ALTER TABLE: recover all the partition in the directory of a table and
 * update the catalog.
 * <p>
 * The syntax of this command is:
 * <pre><code>
 *   ALTER TABLE table RECOVER PARTITIONS;
 *   MSCK REPAIR TABLE table;
 * </code></pre>
 */
public  class AlterTableRecoverPartitionsCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.RunnableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier tableName ()  { throw new RuntimeException(); }
  public  java.lang.String cmd ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterTableRecoverPartitionsCommand (org.apache.spark.sql.catalyst.TableIdentifier tableName, java.lang.String cmd)  { throw new RuntimeException(); }
  public  java.lang.String NUM_FILES ()  { throw new RuntimeException(); }
  public  java.lang.String TOTAL_SIZE ()  { throw new RuntimeException(); }
  public  java.lang.String DDL_TIME ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
}
