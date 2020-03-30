package org.apache.spark.streaming.kinesis;
public  class KinesisInputDStream$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KinesisInputDStream$ MODULE$ = null;
  public   KinesisInputDStream$ ()  { throw new RuntimeException(); }
  /**
   * Creates a {@link KinesisInputDStream.Builder} for constructing {@link KinesisInputDStream} instances.
   * <p>
   * @since 2.2.0
   * @return {@link KinesisInputDStream.Builder} instance
   */
  public  org.apache.spark.streaming.kinesis.KinesisInputDStream.Builder builder ()  { throw new RuntimeException(); }
    byte[] defaultMessageHandler (com.amazonaws.services.kinesis.model.Record record)  { throw new RuntimeException(); }
    java.lang.String DEFAULT_KINESIS_ENDPOINT_URL ()  { throw new RuntimeException(); }
    java.lang.String DEFAULT_KINESIS_REGION_NAME ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.kinesis.KinesisInitialPosition DEFAULT_INITIAL_POSITION ()  { throw new RuntimeException(); }
    org.apache.spark.storage.StorageLevel DEFAULT_STORAGE_LEVEL ()  { throw new RuntimeException(); }
    com.amazonaws.services.kinesis.metrics.interfaces.MetricsLevel DEFAULT_METRICS_LEVEL ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.String> DEFAULT_METRICS_ENABLED_DIMENSIONS ()  { throw new RuntimeException(); }
}
