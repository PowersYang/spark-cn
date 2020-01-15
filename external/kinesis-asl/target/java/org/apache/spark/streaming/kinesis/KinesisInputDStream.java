package org.apache.spark.streaming.kinesis;
  class KinesisInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.ReceiverInputDStream<T> {
  /**
   * Builder for {@link KinesisInputDStream} instances.
   * <p>
   * @since 2.2.0
   */
  static public  class Builder {
    public   Builder ()  { throw new RuntimeException(); }
    /**
     * Create a new instance of {@link KinesisInputDStream} with configured parameters and using the
     * default message handler, which returns {@link Array[Byte}].
     * <p>
     * @return Instance of {@link KinesisInputDStream} constructed with configured parameters
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream<byte[]> build ()  { throw new RuntimeException(); }
    /**
     * Create a new instance of {@link KinesisInputDStream} with configured parameters and the provided
     * message handler.
     * <p>
     * @param handler Function converting {@link Record} instances read by the KCL to DStream type {@link T}
     * @return Instance of {@link KinesisInputDStream} constructed with configured parameters
     * @param evidence$2 (undocumented)
     */
    public <T extends java.lang.Object> org.apache.spark.streaming.kinesis.KinesisInputDStream<T> buildWithMessageHandler (scala.Function1<com.amazonaws.services.kinesis.model.Record, T> handler, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
    /**
     * Sets the KCL application name to use when checkpointing state to DynamoDB. This is a
     * required parameter.
     * <p>
     * @param appName Value to use for the KCL app name (used when creating the DynamoDB checkpoint
     *                table and when writing metrics to CloudWatch)
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder checkpointAppName (java.lang.String appName)  { throw new RuntimeException(); }
    /**
     * Sets how often the KCL application state is checkpointed to DynamoDB. Defaults to the Spark
     * Streaming batch interval if no custom value is specified.
     * <p>
     * @param interval {@link Duration} specifying how often the KCL state should be checkpointed to
     *                 DynamoDB.
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder checkpointInterval (org.apache.spark.streaming.Duration interval)  { throw new RuntimeException(); }
    /**
     * Sets the {@link SparkAWSCredentials} to use for authenticating to the AWS CloudWatch
     * endpoint. Will use the same credentials used for AWS Kinesis if no custom value is set.
     * <p>
     * @param credentials {@link SparkAWSCredentials} to use for CloudWatch authentication
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder cloudWatchCredentials (org.apache.spark.streaming.kinesis.SparkAWSCredentials credentials)  { throw new RuntimeException(); }
    /**
     * Sets the {@link SparkAWSCredentials} to use for authenticating to the AWS DynamoDB
     * endpoint. Will use the same credentials used for AWS Kinesis if no custom value is set.
     * <p>
     * @param credentials {@link SparkAWSCredentials} to use for DynamoDB authentication
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder dynamoDBCredentials (org.apache.spark.streaming.kinesis.SparkAWSCredentials credentials)  { throw new RuntimeException(); }
    /**
     * Sets the AWS Kinesis endpoint URL. Defaults to "https://kinesis.us-east-1.amazonaws.com" if
     * no custom value is specified
     * <p>
     * @param url Kinesis endpoint URL to use
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder endpointUrl (java.lang.String url)  { throw new RuntimeException(); }
    /**
     * Sets the initial position data is read from in the Kinesis stream. Defaults to
     * {@link KinesisInitialPositions.Latest} if no custom value is specified.
     * <p>
     * @param initialPosition {@link KinesisInitialPosition} value specifying where Spark Streaming
     *                        will start reading records in the Kinesis stream from
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder initialPosition (org.apache.spark.streaming.kinesis.KinesisInitialPosition initialPosition)  { throw new RuntimeException(); }
    /**
     * Sets the initial position data is read from in the Kinesis stream. Defaults to
     * {@link InitialPositionInStream.LATEST} if no custom value is specified.
     * This function would be removed when we deprecate the KinesisUtils.
     * <p>
     * @param initialPosition InitialPositionInStream value specifying where Spark Streaming
     *                        will start reading records in the Kinesis stream from
     * @return Reference to this {@link KinesisInputDStream.Builder}
     *
     * @deprecated use initialPosition(initialPosition: KinesisInitialPosition). Since 2.3.0. 
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder initialPositionInStream (com.amazonaws.services.kinesis.clientlibrary.lib.worker.InitialPositionInStream initialPosition)  { throw new RuntimeException(); }
    /**
     * Sets the {@link SparkAWSCredentials} to use for authenticating to the AWS Kinesis
     * endpoint. Defaults to {@link DefaultCredentialsProvider} if no custom value is specified.
     * <p>
     * @param credentials {@link SparkAWSCredentials} to use for Kinesis authentication
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder kinesisCredentials (org.apache.spark.streaming.kinesis.SparkAWSCredentials credentials)  { throw new RuntimeException(); }
    /**
     * Sets the enabled CloudWatch metrics dimensions. Defaults to
     * {@link KinesisClientLibConfiguration.DEFAULT_METRICS_ENABLED_DIMENSIONS}
     * if no custom value is specified.
     * <p>
     * @param metricsEnabledDimensions Set[String] to specify which CloudWatch metrics dimensions
     *   should be enabled
     * @return Reference to this {@link KinesisInputDStream.Builder}
     * @see
     * {@link https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-kcl.html#metric-levels}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder metricsEnabledDimensions (scala.collection.immutable.Set<java.lang.String> metricsEnabledDimensions)  { throw new RuntimeException(); }
    /**
     * Sets the CloudWatch metrics level. Defaults to
     * {@link KinesisClientLibConfiguration.DEFAULT_METRICS_LEVEL} if no custom value is specified.
     * <p>
     * @param metricsLevel {@link MetricsLevel} to specify the CloudWatch metrics level
     * @return Reference to this {@link KinesisInputDStream.Builder}
     * @see
     * {@link https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-kcl.html#metric-levels}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder metricsLevel (com.amazonaws.services.kinesis.metrics.interfaces.MetricsLevel metricsLevel)  { throw new RuntimeException(); }
    /**
     * Sets the AWS region to construct clients for. Defaults to "us-east-1" if no custom value
     * is specified.
     * <p>
     * @param regionName Name of AWS region to use (e.g. "us-west-2")
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder regionName (java.lang.String regionName)  { throw new RuntimeException(); }
    /**
     * Sets the storage level of the blocks for the DStream created. Defaults to
     * {@link StorageLevel.MEMORY_AND_DISK_2} if no custom value is specified.
     * <p>
     * @param storageLevel {@link StorageLevel} to use for the DStream data blocks
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder storageLevel (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
    /**
     * Sets the name of the Kinesis stream that the DStream will read from. This is a required
     * parameter.
     * <p>
     * @param streamName Name of Kinesis stream that the DStream will read from
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder streamName (java.lang.String streamName)  { throw new RuntimeException(); }
    /**
     * Sets the StreamingContext that will be used to construct the Kinesis DStream. This is a
     * required parameter.
     * <p>
     * @param ssc {@link StreamingContext} used to construct Kinesis DStreams
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder streamingContext (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
    /**
     * Sets the StreamingContext that will be used to construct the Kinesis DStream. This is a
     * required parameter.
     * <p>
     * @param jssc {@link JavaStreamingContext} used to construct Kinesis DStreams
     * @return Reference to this {@link KinesisInputDStream.Builder}
     */
    public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder streamingContext (org.apache.spark.streaming.api.java.JavaStreamingContext jssc)  { throw new RuntimeException(); }
  }
  /**
   * Creates a {@link KinesisInputDStream.Builder} for constructing {@link KinesisInputDStream} instances.
   * <p>
   * @since 2.2.0
   * @return {@link KinesisInputDStream.Builder} instance
   */
  static public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder builder ()  { throw new RuntimeException(); }
  static   byte[] defaultMessageHandler (com.amazonaws.services.kinesis.model.Record record)  { throw new RuntimeException(); }
  static   java.lang.String DEFAULT_KINESIS_ENDPOINT_URL ()  { throw new RuntimeException(); }
  static   java.lang.String DEFAULT_KINESIS_REGION_NAME ()  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.kinesis.KinesisInitialPosition DEFAULT_INITIAL_POSITION ()  { throw new RuntimeException(); }
  static   org.apache.spark.storage.StorageLevel DEFAULT_STORAGE_LEVEL ()  { throw new RuntimeException(); }
  static   com.amazonaws.services.kinesis.metrics.interfaces.MetricsLevel DEFAULT_METRICS_LEVEL ()  { throw new RuntimeException(); }
  static   scala.collection.immutable.Set<java.lang.String> DEFAULT_METRICS_ENABLED_DIMENSIONS ()  { throw new RuntimeException(); }
  public  java.lang.String streamName ()  { throw new RuntimeException(); }
  public  java.lang.String endpointUrl ()  { throw new RuntimeException(); }
  public  java.lang.String regionName ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kinesis.KinesisInitialPosition initialPosition ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointAppName ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration checkpointInterval ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel _storageLevel ()  { throw new RuntimeException(); }
  public  scala.Function1<com.amazonaws.services.kinesis.model.Record, T> messageHandler ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kinesis.SparkAWSCredentials kinesisCreds ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.kinesis.SparkAWSCredentials> dynamoDBCreds ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.kinesis.SparkAWSCredentials> cloudWatchCreds ()  { throw new RuntimeException(); }
  public  com.amazonaws.services.kinesis.metrics.interfaces.MetricsLevel metricsLevel ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> metricsEnabledDimensions ()  { throw new RuntimeException(); }
  // not preceding
  public   KinesisInputDStream (org.apache.spark.streaming.StreamingContext _ssc, java.lang.String streamName, java.lang.String endpointUrl, java.lang.String regionName, org.apache.spark.streaming.kinesis.KinesisInitialPosition initialPosition, java.lang.String checkpointAppName, org.apache.spark.streaming.Duration checkpointInterval, org.apache.spark.storage.StorageLevel _storageLevel, scala.Function1<com.amazonaws.services.kinesis.model.Record, T> messageHandler, org.apache.spark.streaming.kinesis.SparkAWSCredentials kinesisCreds, scala.Option<org.apache.spark.streaming.kinesis.SparkAWSCredentials> dynamoDBCreds, scala.Option<org.apache.spark.streaming.kinesis.SparkAWSCredentials> cloudWatchCreds, com.amazonaws.services.kinesis.metrics.interfaces.MetricsLevel metricsLevel, scala.collection.immutable.Set<java.lang.String> metricsEnabledDimensions, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
    org.apache.spark.rdd.RDD<T> createBlockRDD (org.apache.spark.streaming.Time time, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> blockInfos)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<T> getReceiver ()  { throw new RuntimeException(); }
}
