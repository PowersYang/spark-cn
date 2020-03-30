package org.apache.spark.streaming.kinesis;
/**
 * This is a helper class that wraps the methods in KinesisUtils into more Python-friendly class and
 * function so that it can be easily instantiated and called from Python's KinesisUtils.
 */
public  class KinesisUtilsPythonHelper {
  public   KinesisUtilsPythonHelper ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaReceiverInputDStream<byte[]> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String kinesisAppName, java.lang.String streamName, java.lang.String endpointUrl, java.lang.String regionName, int initialPositionInStream, org.apache.spark.streaming.Duration checkpointInterval, org.apache.spark.storage.StorageLevel storageLevel, java.lang.String awsAccessKeyId, java.lang.String awsSecretKey, java.lang.String stsAssumeRoleArn, java.lang.String stsSessionName, java.lang.String stsExternalId)  { throw new RuntimeException(); }
}
