package org.apache.spark.sql.execution.streaming.continuous.shuffle;
/**
 * RDD at the map side of each continuous processing shuffle task. Upstream tasks send their
 * shuffle output to the wrapped receivers in partitions of this RDD; each of the RDD's tasks
 * poll from their receiver until an epoch marker is sent.
 * <p>
 * param:  sc the RDD context
 * param:  numPartitions the number of read partitions for this RDD
 * param:  queueSize the size of the row buffers to use
 * param:  numShuffleWriters the number of continuous shuffle writers feeding into this RDD
 * param:  epochIntervalMs the checkpoint interval of the streaming query
 */
public  class ContinuousShuffleReadRDD extends org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.UnsafeRow> {
  public  scala.collection.Seq<java.lang.String> endpointNames ()  { throw new RuntimeException(); }
  // not preceding
  public   ContinuousShuffleReadRDD (org.apache.spark.SparkContext sc, int numPartitions, int queueSize, int numShuffleWriters, long epochIntervalMs, scala.collection.Seq<java.lang.String> endpointNames)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
