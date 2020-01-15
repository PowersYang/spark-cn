package org.apache.spark.streaming.kinesis;
/**
 * Shared utility methods for performing Kinesis tests that actually transfer data.
 * <p>
 * PLEASE KEEP THIS FILE UNDER src/main AS PYTHON TESTS NEED ACCESS TO THIS FILE!
 */
  class KinesisTestUtils implements org.apache.spark.internal.Logging {
  static public  java.lang.String envVarNameForEnablingTests ()  { throw new RuntimeException(); }
  static public  java.lang.String endVarNameForEndpoint ()  { throw new RuntimeException(); }
  static public  java.lang.String defaultEndpointUrl ()  { throw new RuntimeException(); }
  static public  java.lang.String getRegionNameByEndpoint (java.lang.String endpoint)  { throw new RuntimeException(); }
  // not preceding
  static public  boolean shouldRunTests ()  { throw new RuntimeException(); }
  static public  boolean isAWSCredentialsPresent ()  { throw new RuntimeException(); }
  static public  com.amazonaws.auth.AWSCredentials getAWSCredentials ()  { throw new RuntimeException(); }
  public   KinesisTestUtils (int streamShardCount)  { throw new RuntimeException(); }
  public  java.lang.String endpointUrl ()  { throw new RuntimeException(); }
  public  java.lang.String regionName ()  { throw new RuntimeException(); }
  // not preceding
  protected  com.amazonaws.services.kinesis.AmazonKinesisClient kinesisClient ()  { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.kinesis.KinesisDataGenerator getProducer (boolean aggregate)  { throw new RuntimeException(); }
  public  java.lang.String streamName ()  { throw new RuntimeException(); }
  public  void createStream ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<com.amazonaws.services.kinesis.model.Shard> getShards ()  { throw new RuntimeException(); }
  public  void splitShard (java.lang.String shardId)  { throw new RuntimeException(); }
  public  void mergeShard (java.lang.String shardToMerge, java.lang.String adjacentShardToMerge)  { throw new RuntimeException(); }
  /**
   * Push data to Kinesis stream and return a map of
   * shardId -> seq of (data, seq number) pushed to corresponding shard
   * @param testData (undocumented)
   * @param aggregate (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.String>>> pushData (scala.collection.Seq<java.lang.Object> testData, boolean aggregate)  { throw new RuntimeException(); }
  /**
   * Expose a Python friendly API.
   * @param testData (undocumented)
   */
  public  void pushData (java.util.List<java.lang.Object> testData)  { throw new RuntimeException(); }
  public  void deleteStream ()  { throw new RuntimeException(); }
  public  void deleteDynamoDBTable (java.lang.String tableName)  { throw new RuntimeException(); }
}
