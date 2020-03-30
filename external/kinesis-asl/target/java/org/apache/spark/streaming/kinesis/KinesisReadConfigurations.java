package org.apache.spark.streaming.kinesis;
/**
 * Configurations to pass to the {@link KinesisBackedBlockRDD}.
 * <p>
 * param:  maxRetries: The maximum number of attempts to be made to Kinesis. Defaults to 3.
 * param:  retryWaitTimeMs: The interval between consequent Kinesis retries.
 *                         Defaults to 100ms.
 * param:  retryTimeoutMs: The timeout in milliseconds for a Kinesis request.
 *                         Defaults to batch duration provided for streaming,
 *                         else uses 10000 if invoked directly.
 */
  class KinesisReadConfigurations implements scala.Product, scala.Serializable {
  static public  org.apache.spark.streaming.kinesis.KinesisReadConfigurations apply ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.kinesis.KinesisReadConfigurations apply (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  /**
   * SparkConf key for configuring the maximum number of retries used when attempting a Kinesis
   * request.
   * @return (undocumented)
   */
  static public  java.lang.String RETRY_MAX_ATTEMPTS_KEY ()  { throw new RuntimeException(); }
  /**
   * SparkConf key for configuring the wait time to use before retrying a Kinesis attempt.
   * @return (undocumented)
   */
  static public  java.lang.String RETRY_WAIT_TIME_KEY ()  { throw new RuntimeException(); }
  /**
   * Default value for the RETRY_MAX_ATTEMPTS_KEY
   * @return (undocumented)
   */
  static public  int DEFAULT_MAX_RETRIES ()  { throw new RuntimeException(); }
  /**
   * Default value for the RETRY_WAIT_TIME_KEY
   * @return (undocumented)
   */
  static public  java.lang.String DEFAULT_RETRY_WAIT_TIME ()  { throw new RuntimeException(); }
  /**
   * Default value for the retry timeout
   * @return (undocumented)
   */
  static public  int DEFAULT_RETRY_TIMEOUT ()  { throw new RuntimeException(); }
  public  int maxRetries ()  { throw new RuntimeException(); }
  public  long retryWaitTimeMs ()  { throw new RuntimeException(); }
  public  long retryTimeoutMs ()  { throw new RuntimeException(); }
  // not preceding
  public   KinesisReadConfigurations (int maxRetries, long retryWaitTimeMs, long retryTimeoutMs)  { throw new RuntimeException(); }
}
