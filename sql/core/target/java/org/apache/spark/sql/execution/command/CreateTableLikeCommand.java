package org.apache.spark.sql.execution.command;
/**
 * A command to create a table with the same definition of the given existing table.
 * In the target table definition, the table comment is always empty but the column comments
 * are identical to the ones defined in the source table.
 * <p>
 * The CatalogTable attributes copied from the source table are storage(inputFormat, outputFormat,
 * serde, compressed, properties), schema, provider, partitionColumnNames, bucketSpec.
 * <p>
 * The syntax of using this command in SQL is:
 * <pre><code>
 *   CREATE TABLE [IF NOT EXISTS] [db_name.]table_name
 *   LIKE [other_db_name.]existing_table_name [locationSpec]
 * </code></pre>
 */
public  class CreateTableLikeCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.RunnableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier targetTable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier sourceTable ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> location ()  { throw new RuntimeException(); }
  public  boolean ifNotExists ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateTableLikeCommand (org.apache.spark.sql.catalyst.TableIdentifier targetTable, org.apache.spark.sql.catalyst.TableIdentifier sourceTable, scala.Option<java.lang.String> location, boolean ifNotExists)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}
