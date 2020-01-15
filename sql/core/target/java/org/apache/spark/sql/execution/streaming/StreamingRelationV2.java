package org.apache.spark.sql.execution.streaming;
/**
 * Used to link a {@link TableProvider} into a streaming
 * {@link org.apache.spark.sql.catalyst.plans.logical.LogicalPlan}. This is only used for creating
 * a streaming {@link org.apache.spark.sql.DataFrame} from {@link org.apache.spark.sql.DataFrameReader},
 * and should be converted before passing to {@link StreamExecution}.
 */
public  class StreamingRelationV2 extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements org.apache.spark.sql.catalyst.analysis.MultiInstanceRelation, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.connector.catalog.TableProvider source ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table table ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.CaseInsensitiveStringMap extraOptions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.StreamingRelation> v1Relation ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamingRelationV2 (org.apache.spark.sql.connector.catalog.TableProvider source, java.lang.String sourceName, org.apache.spark.sql.connector.catalog.Table table, org.apache.spark.sql.util.CaseInsensitiveStringMap extraOptions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, scala.Option<org.apache.spark.sql.execution.streaming.StreamingRelation> v1Relation, org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> otherCopyArgs ()  { throw new RuntimeException(); }
  public  boolean isStreaming ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics computeStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newInstance ()  { throw new RuntimeException(); }
}
