package org.apache.spark.streaming.kinesis;
/**
 * Custom AWS Kinesis-specific implementation of Spark Streaming's Receiver.
 * This implementation relies on the Kinesis Client Library (KCL) Worker as described here:
 * https://github.com/awslabs/amazon-kinesis-client
 * <p>
 * The way this Receiver works is as follows:
 * <p>
 *  - The receiver starts a KCL Worker, which is essentially runs a threadpool of multiple
 *    KinesisRecordProcessor
 *  - Each KinesisRecordProcessor receives data from a Kinesis shard in batches. Each batch is
 *    inserted into a Block Generator, and the corresponding range of sequence numbers is recorded.
 *  - When the block generator defines a block, then the recorded sequence number ranges that were
 *    inserted into the block are recorded separately for being used later.
 *  - When the block is ready to be pushed, the block is pushed and the ranges are reported as
 *    metadata of the block. In addition, the ranges are used to find out the latest sequence
 *    number for each shard that can be checkpointed through the DynamoDB.
 *  - Periodically, each KinesisRecordProcessor checkpoints the latest successfully stored sequence
 *    number for it own shard.
 * <p>
 * param:  streamName   Kinesis stream name
 * param:  endpointUrl  Url of Kinesis service (e.g., https://kinesis.us-east-1.amazonaws.com)
 * param:  regionName  Region name used by the Kinesis Client Library for
 *                    DynamoDB (lease coordination and checkpointing) and CloudWatch (metrics)
 * param:  initialPosition  Instance of {@link KinesisInitialPosition}
 *                         In the absence of Kinesis checkpoint info, this is the
 *                         worker's initial starting position in the stream.
 *                         The values are either the beginning of the stream
 *                         per Kinesis' limit of 24 hours
 *                         ({@link KinesisInitialPositions.TrimHorizon}) or
 *                         the tip of the stream ({@link KinesisInitialPositions.Latest}).
 * param:  checkpointAppName  Kinesis application name. Kinesis Apps are mapped to Kinesis Streams
 *                 by the Kinesis Client Library.  If you change the App name or Stream name,
 *                 the KCL will throw errors.  This usually requires deleting the backing
 *                 DynamoDB table with the same name this Kinesis application.
 * param:  checkpointInterval  Checkpoint interval for Kinesis checkpointing.
 *                            See the Kinesis Spark Streaming documentation for more
 *                            details on the different types of checkpoints.
 * param:  storageLevel Storage level to use for storing the received objects
 * param:  kinesisCreds SparkAWSCredentials instance that will be used to generate the
 *                     AWSCredentialsProvider passed to the KCL to authorize Kinesis API calls.
 * param:  cloudWatchCreds Optional SparkAWSCredentials instance that will be used to generate the
 *                        AWSCredentialsProvider passed to the KCL to authorize CloudWatch API
 *                        calls. Will use kinesisCreds if value is None.
 * param:  dynamoDBCreds Optional SparkAWSCredentials instance that will be used to generate the
 *                      AWSCredentialsProvider passed to the KCL to authorize DynamoDB API calls.
 *                      Will use kinesisCreds if value is None.
 */
  class KinesisReceiver<T extends java.lang.Object> extends org.apache.spark.streaming.receiver.Receiver<T> implements org.apache.spark.internal.Logging {
  // not preceding
  public   KinesisReceiver (java.lang.String streamName, java.lang.String endpointUrl, java.lang.String regionName, org.apache.spark.streaming.kinesis.KinesisInitialPosition initialPosition, java.lang.String checkpointAppName, org.apache.spark.streaming.Duration checkpointInterval, org.apache.spark.storage.StorageLevel storageLevel, scala.Function1<com.amazonaws.services.kinesis.model.Record, T> messageHandler, org.apache.spark.streaming.kinesis.SparkAWSCredentials kinesisCreds, scala.Option<org.apache.spark.streaming.kinesis.SparkAWSCredentials> dynamoDBCreds, scala.Option<org.apache.spark.streaming.kinesis.SparkAWSCredentials> cloudWatchCreds, com.amazonaws.services.kinesis.metrics.interfaces.MetricsLevel metricsLevel, scala.collection.immutable.Set<java.lang.String> metricsEnabledDimensions)  { throw new RuntimeException(); }
  /** Add records of the given shard to the current block being generated */
    void addRecords (java.lang.String shardId, java.util.List<com.amazonaws.services.kinesis.model.Record> records)  { throw new RuntimeException(); }
  /** Return the current rate limit defined in {@link BlockGenerator}. */
    int getCurrentLimit ()  { throw new RuntimeException(); }
  /** Get the latest sequence number for the given shard that can be checkpointed through KCL */
    scala.Option<java.lang.String> getLatestSeqNumToCheckpoint (java.lang.String shardId)  { throw new RuntimeException(); }
  /**
   * This is called when the KinesisReceiver starts and must be non-blocking.
   * The KCL creates and manages the receiving/processing thread pool through Worker.run().
   */
  public  void onStart ()  { throw new RuntimeException(); }
  /**
   * This is called when the KinesisReceiver stops.
   * The KCL worker.shutdown() method stops the receiving/processing threads.
   * The KCL will do its best to drain and checkpoint any in-flight records upon shutdown.
   */
  public  void onStop ()  { throw new RuntimeException(); }
  /**
   * Remove the checkpointer for the given shardId. The provided checkpointer will be used to
   * checkpoint one last time for the given shard. If <code>checkpointer</code> is <code>null</code>, then we will not
   * checkpoint.
   * @param shardId (undocumented)
   * @param checkpointer (undocumented)
   */
  public  void removeCheckpointer (java.lang.String shardId, com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorCheckpointer checkpointer)  { throw new RuntimeException(); }
  /**
   * Set the checkpointer that will be used to checkpoint sequence numbers to DynamoDB for the
   * given shardId.
   * @param shardId (undocumented)
   * @param checkpointer (undocumented)
   */
  public  void setCheckpointer (java.lang.String shardId, com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorCheckpointer checkpointer)  { throw new RuntimeException(); }
  public  java.lang.String streamName ()  { throw new RuntimeException(); }
}
