package org.apache.spark.streaming.kinesis;
/**
 * Kinesis-specific implementation of the Kinesis Client Library (KCL) IRecordProcessor.
 * This implementation operates on the Array[Byte] from the KinesisReceiver.
 * The Kinesis Worker creates an instance of this KinesisRecordProcessor for each
 * shard in the Kinesis stream upon startup.  This is normally done in separate threads,
 * but the KCLs within the KinesisReceivers will balance themselves out if you create
 * multiple Receivers.
 * <p>
 * param:  receiver Kinesis receiver
 * param:  workerId for logging purposes
 */
  class KinesisRecordProcessor<T extends java.lang.Object> implements com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessor, org.apache.spark.internal.Logging {
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
  static public <T extends java.lang.Object> T retryRandom (scala.Function0<T> expression, int numRetriesLeft, int maxBackOffMillis)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  public   KinesisRecordProcessor (org.apache.spark.streaming.kinesis.KinesisReceiver<T> receiver, java.lang.String workerId)  { throw new RuntimeException(); }
  /**
   * The Kinesis Client Library calls this method during IRecordProcessor initialization.
   * <p>
   * @param shardId assigned by the KCL to this particular RecordProcessor.
   */
  public  void initialize (java.lang.String shardId)  { throw new RuntimeException(); }
  /**
   * This method is called by the KCL when a batch of records is pulled from the Kinesis stream.
   * This is the record-processing bridge between the KCL's IRecordProcessor.processRecords()
   * and Spark Streaming's Receiver.store().
   * <p>
   * @param batch list of records from the Kinesis stream shard
   * @param checkpointer used to update Kinesis when this batch has been processed/stored
   *   in the DStream
   */
  public  void processRecords (java.util.List<com.amazonaws.services.kinesis.model.Record> batch, com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorCheckpointer checkpointer)  { throw new RuntimeException(); }
  /**
   * Kinesis Client Library is shutting down this Worker for 1 of 2 reasons:
   * 1) the stream is resharding by splitting or merging adjacent shards
   *     (ShutdownReason.TERMINATE)
   * 2) the failed or latent Worker has stopped sending heartbeats for whatever reason
   *     (ShutdownReason.ZOMBIE)
   * <p>
   * @param checkpointer used to perform a Kinesis checkpoint for ShutdownReason.TERMINATE
   * @param reason for shutdown (ShutdownReason.TERMINATE or ShutdownReason.ZOMBIE)
   */
  public  void shutdown (com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorCheckpointer checkpointer, com.amazonaws.services.kinesis.clientlibrary.lib.worker.ShutdownReason reason)  { throw new RuntimeException(); }
}
