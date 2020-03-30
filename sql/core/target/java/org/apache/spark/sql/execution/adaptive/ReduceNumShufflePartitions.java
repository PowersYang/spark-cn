package org.apache.spark.sql.execution.adaptive;
/**
 * A rule to adjust the post shuffle partitions based on the map output statistics.
 * <p>
 * The strategy used to determine the number of post-shuffle partitions is described as follows.
 * To determine the number of post-shuffle partitions, we have a target input size for a
 * post-shuffle partition. Once we have size statistics of all pre-shuffle partitions, we will do
 * a pass of those statistics and pack pre-shuffle partitions with continuous indices to a single
 * post-shuffle partition until adding another pre-shuffle partition would cause the size of a
 * post-shuffle partition to be greater than the target size.
 * <p>
 * For example, we have two stages with the following pre-shuffle partition size statistics:
 * stage 1: [100 MiB, 20 MiB, 100 MiB, 10MiB, 30 MiB]
 * stage 2: [10 MiB,  10 MiB, 70 MiB,  5 MiB, 5 MiB]
 * assuming the target input size is 128 MiB, we will have four post-shuffle partitions,
 * which are:
 *  - post-shuffle partition 0: pre-shuffle partition 0 (size 110 MiB)
 *  - post-shuffle partition 1: pre-shuffle partition 1 (size 30 MiB)
 *  - post-shuffle partition 2: pre-shuffle partition 2 (size 170 MiB)
 *  - post-shuffle partition 3: pre-shuffle partition 3 and 4 (size 50 MiB)
 */
public  class ReduceNumShufflePartitions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   ReduceNumShufflePartitions (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  /**
   * Estimates partition start indices for post-shuffle partitions based on
   * mapOutputStatistics provided by all pre-shuffle stages.
   * @param mapOutputStatistics (undocumented)
   * @return (undocumented)
   */
    int[] estimatePartitionStartIndices (org.apache.spark.MapOutputStatistics[] mapOutputStatistics)  { throw new RuntimeException(); }
}
