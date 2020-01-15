package org.apache.spark.executor;
/**
 * A class that polls executor metrics, and tracks their peaks per task and per stage.
 * Each executor keeps an instance of this class.
 * The poll method polls the executor metrics, and is either run in its own thread or
 * called by the executor's heartbeater thread, depending on configuration.
 * The class keeps two ConcurrentHashMaps that are accessed (via its methods) by the
 * executor's task runner threads concurrently with the polling thread. One thread may
 * update one of these maps while another reads it, so the reading thread may not get
 * the latest metrics, but this is ok.
 * We track executor metric peaks per stage, as well as per task. The per-stage peaks
 * are sent in executor heartbeats. That way, we get incremental updates of the metrics
 * as the tasks are running, and if the executor dies we still have some metrics. The
 * per-task peaks are sent in the task result at task end. These are useful for short
 * tasks. If there are no heartbeats during the task, we still get the metrics polled
 * for the task.
 * <p>
 * param:  memoryManager the memory manager used by the executor.
 * param:  pollingInterval the polling interval in milliseconds.
 */
  class ExecutorMetricsPoller implements org.apache.spark.internal.Logging {
  public   ExecutorMetricsPoller (org.apache.spark.memory.MemoryManager memoryManager, long pollingInterval)  { throw new RuntimeException(); }
  /**
   * Called by the reportHeartBeat function defined in Executor and passed to its Heartbeater.
   * It resets the metric peaks in stageTCMP before returning the executor updates.
   * Thus, the executor updates contains the per-stage metric peaks since the last heartbeat
   * (the last time this method was called).
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.executor.ExecutorMetrics> getExecutorUpdates ()  { throw new RuntimeException(); }
  /**
   * Called by TaskRunner#run.
   * @param taskId (undocumented)
   * @return (undocumented)
   */
  public  long[] getTaskMetricPeaks (long taskId)  { throw new RuntimeException(); }
  /**
   * Called by TaskRunner#run. It should only be called if onTaskStart has been called with
   * the same arguments.
   * @param taskId (undocumented)
   * @param stageId (undocumented)
   * @param stageAttemptId (undocumented)
   */
  public  void onTaskCompletion (long taskId, int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  /**
   * Called by TaskRunner#run.
   * @param taskId (undocumented)
   * @param stageId (undocumented)
   * @param stageAttemptId (undocumented)
   */
  public  void onTaskStart (long taskId, int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  /**
   * Function to poll executor metrics.
   * On start, if pollingInterval is positive, this is scheduled to run at that interval.
   * Otherwise, this is called by the reportHeartBeat function defined in Executor and passed
   * to its Heartbeater.
   */
  public  void poll ()  { throw new RuntimeException(); }
  /** Starts the polling thread. */
  public  void start ()  { throw new RuntimeException(); }
  /** Stops the polling thread. */
  public  void stop ()  { throw new RuntimeException(); }
}
