package org.apache.spark.sql.execution.adaptive;
/**
 * The {@link Partition} used by {@link LocalShuffledRowRDD}. A pre-shuffle partition
 * (identified by <code>preShufflePartitionIndex</code>) contains a range of post-shuffle partitions
 * (<code>startPostShufflePartitionIndex</code> to <code>endPostShufflePartitionIndex - 1</code>, inclusive).
 */
public final class LocalShuffledRowRDDPartition implements org.apache.spark.Partition {
  // not preceding
  public   LocalShuffledRowRDDPartition (int preShufflePartitionIndex)  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  int preShufflePartitionIndex ()  { throw new RuntimeException(); }
}
