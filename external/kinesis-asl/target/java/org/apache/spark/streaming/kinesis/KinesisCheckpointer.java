package org.apache.spark.streaming.kinesis;
/**
 * This is a helper class for managing Kinesis checkpointing.
 * <p>
 * param:  receiver The receiver that keeps track of which sequence numbers we can checkpoint
 * param:  checkpointInterval How frequently we will checkpoint to DynamoDB
 * param:  workerId Worker Id of KCL worker for logging purposes
 * param:  clock In order to use ManualClocks for the purpose of testing
 */
  class KinesisCheckpointer implements org.apache.spark.internal.Logging {
  public   KinesisCheckpointer (org.apache.spark.streaming.kinesis.KinesisReceiver<?> receiver, org.apache.spark.streaming.Duration checkpointInterval, java.lang.String workerId, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  /** Update the checkpointer instance to the most recent one for the given shardId. */
  public  void setCheckpointer (java.lang.String shardId, com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorCheckpointer checkpointer)  { throw new RuntimeException(); }
  /**
   * Stop tracking the specified shardId.
   * <p>
   * If a checkpointer is provided, e.g. on IRecordProcessor.shutdown {@link ShutdownReason.TERMINATE},
   * we will use that to make the final checkpoint. If <code>null</code> is provided, we will not make the
   * checkpoint, e.g. in case of {@link ShutdownReason.ZOMBIE}.
   * @param shardId (undocumented)
   * @param checkpointer (undocumented)
   */
  public  void removeCheckpointer (java.lang.String shardId, com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorCheckpointer checkpointer)  { throw new RuntimeException(); }
  /**
   * Shutdown the checkpointer. Should be called on the onStop of the Receiver.
   */
  public  void shutdown ()  { throw new RuntimeException(); }
}
