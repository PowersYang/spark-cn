package org.apache.spark.streaming.kinesis;
/**
 * A BlockRDD where the block data is backed by Kinesis, which can accessed using the
 * sequence numbers of the corresponding blocks.
 */
  class KinesisBackedBlockRDD<T extends java.lang.Object> extends org.apache.spark.rdd.BlockRDD<T> {
  public  java.lang.String regionName ()  { throw new RuntimeException(); }
  public  java.lang.String endpointUrl ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kinesis.SequenceNumberRanges[] arrayOfseqNumberRanges ()  { throw new RuntimeException(); }
  public  scala.Function1<com.amazonaws.services.kinesis.model.Record, T> messageHandler ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kinesis.SparkAWSCredentials kinesisCreds ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kinesis.KinesisReadConfigurations kinesisReadConfigs ()  { throw new RuntimeException(); }
  // not preceding
  public   KinesisBackedBlockRDD (org.apache.spark.SparkContext sc, java.lang.String regionName, java.lang.String endpointUrl, org.apache.spark.storage.BlockId[] _blockIds, org.apache.spark.streaming.kinesis.SequenceNumberRanges[] arrayOfseqNumberRanges, boolean[] isBlockIdValid, scala.Function1<com.amazonaws.services.kinesis.model.Record, T> messageHandler, org.apache.spark.streaming.kinesis.SparkAWSCredentials kinesisCreds, org.apache.spark.streaming.kinesis.KinesisReadConfigurations kinesisReadConfigs, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  boolean isValid ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
