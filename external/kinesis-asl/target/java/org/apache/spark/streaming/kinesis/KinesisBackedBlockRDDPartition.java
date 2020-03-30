package org.apache.spark.streaming.kinesis;
/** Partition storing the information of the ranges of Kinesis sequence numbers to read */
  class KinesisBackedBlockRDDPartition extends org.apache.spark.rdd.BlockRDDPartition {
  // not preceding
  public   KinesisBackedBlockRDDPartition (int idx, org.apache.spark.storage.BlockId blockId, boolean isBlockIdValid, org.apache.spark.streaming.kinesis.SequenceNumberRanges seqNumberRanges)  { throw new RuntimeException(); }
  public  boolean isBlockIdValid ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kinesis.SequenceNumberRanges seqNumberRanges ()  { throw new RuntimeException(); }
}
