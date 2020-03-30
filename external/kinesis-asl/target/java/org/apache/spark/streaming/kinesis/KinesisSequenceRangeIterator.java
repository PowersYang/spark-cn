package org.apache.spark.streaming.kinesis;
/**
 * An iterator that return the Kinesis data based on the given range of sequence numbers.
 * Internally, it repeatedly fetches sets of records starting from the fromSequenceNumber,
 * until the endSequenceNumber is reached.
 */
  class KinesisSequenceRangeIterator extends org.apache.spark.util.NextIterator<com.amazonaws.services.kinesis.model.Record> implements org.apache.spark.internal.Logging {
  public   KinesisSequenceRangeIterator (com.amazonaws.auth.AWSCredentials credentials, java.lang.String endpointUrl, java.lang.String regionId, org.apache.spark.streaming.kinesis.SequenceNumberRange range, org.apache.spark.streaming.kinesis.KinesisReadConfigurations kinesisReadConfigs)  { throw new RuntimeException(); }
  protected  void close ()  { throw new RuntimeException(); }
  protected  com.amazonaws.services.kinesis.model.Record getNext ()  { throw new RuntimeException(); }
}
