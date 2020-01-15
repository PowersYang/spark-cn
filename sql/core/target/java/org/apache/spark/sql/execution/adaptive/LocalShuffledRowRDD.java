package org.apache.spark.sql.execution.adaptive;
/**
 * This is a specialized version of {@link org.apache.spark.sql.execution.ShuffledRowRDD}. This is used
 * in Spark SQL adaptive execution when a shuffle join is converted to broadcast join at runtime
 * because the map output of one input table is small enough for broadcast. This RDD represents the
 * data of another input table of the join that reads from shuffle. Each partition of the RDD reads
 * the whole data from just one mapper output locally. So actually there is no data transferred
 * from the network.
 * <p>
 * This RDD takes a {@link ShuffleDependency} (<code>dependency</code>).
 * <p>
 * The <code>dependency</code> has the parent RDD of this RDD, which represents the dataset before shuffle
 * (i.e. map output). Elements of this RDD are (partitionId, Row) pairs.
 * Partition ids should be in the range [0, numPartitions - 1].
 * <code>dependency.partitioner.numPartitions</code> is the number of pre-shuffle partitions. (i.e. the number
 * of partitions of the map output). The post-shuffle partition number is the same to the parent
 * RDD's partition number.
 */
public  class LocalShuffledRowRDD extends org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> {
  // not preceding
  public   LocalShuffledRowRDD (org.apache.spark.ShuffleDependency<java.lang.Object, org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> dependency, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics)  { throw new RuntimeException(); }
  public  void clearDependencies ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.ShuffleDependency<java.lang.Object, org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> dependency ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.Dependency<?>> getDependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition partition)  { throw new RuntimeException(); }
}
