package org.apache.spark.streaming.kinesis;
public  class KinesisRecordProcessor$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KinesisRecordProcessor$ MODULE$ = null;
  public   KinesisRecordProcessor$ ()  { throw new RuntimeException(); }
  /**
   * Retry the given amount of times with a random backoff time (millis) less than the
   *   given maxBackOffMillis
   * <p>
   * @param expression expression to evaluate
   * @param numRetriesLeft number of retries left
   * @param maxBackOffMillis: max millis between retries
   * <p>
   * @return evaluation of the given expression
   * @throws Unretryable exception, unexpected exception,
   *  or any exception that persists after numRetriesLeft reaches 0
   */
  public <T extends java.lang.Object> T retryRandom (scala.Function0<T> expression, int numRetriesLeft, int maxBackOffMillis)  { throw new RuntimeException(); }
}
