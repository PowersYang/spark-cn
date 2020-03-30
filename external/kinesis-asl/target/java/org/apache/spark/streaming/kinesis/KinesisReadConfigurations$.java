package org.apache.spark.streaming.kinesis;
public  class KinesisReadConfigurations$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KinesisReadConfigurations$ MODULE$ = null;
  public   KinesisReadConfigurations$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kinesis.KinesisReadConfigurations apply ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kinesis.KinesisReadConfigurations apply (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  /**
   * SparkConf key for configuring the maximum number of retries used when attempting a Kinesis
   * request.
   * @return (undocumented)
   */
  public  java.lang.String RETRY_MAX_ATTEMPTS_KEY ()  { throw new RuntimeException(); }
  /**
   * SparkConf key for configuring the wait time to use before retrying a Kinesis attempt.
   * @return (undocumented)
   */
  public  java.lang.String RETRY_WAIT_TIME_KEY ()  { throw new RuntimeException(); }
  /**
   * Default value for the RETRY_MAX_ATTEMPTS_KEY
   * @return (undocumented)
   */
  public  int DEFAULT_MAX_RETRIES ()  { throw new RuntimeException(); }
  /**
   * Default value for the RETRY_WAIT_TIME_KEY
   * @return (undocumented)
   */
  public  java.lang.String DEFAULT_RETRY_WAIT_TIME ()  { throw new RuntimeException(); }
  /**
   * Default value for the retry timeout
   * @return (undocumented)
   */
  public  int DEFAULT_RETRY_TIMEOUT ()  { throw new RuntimeException(); }
}
