package org.apache.spark;
/**
 * An agent that dynamically allocates and removes executors based on the workload.
 * <p>
 * The ExecutorAllocationManager maintains a moving target number of executors which is periodically
 * synced to the cluster manager. The target starts at a configured initial value and changes with
 * the number of pending and running tasks.
 * <p>
 * Decreasing the target number of executors happens when the current target is more than needed to
 * handle the current load. The target number of executors is always truncated to the number of
 * executors that could run all current running and pending tasks at once.
 * <p>
 * Increasing the target number of executors happens in response to backlogged tasks waiting to be
 * scheduled. If the scheduler queue is not drained in N seconds, then new executors are added. If
 * the queue persists for another M seconds, then more executors are added and so on. The number
 * added in each round increases exponentially from the previous round until an upper bound has been
 * reached. The upper bound is based both on a configured property and on the current number of
 * running and pending tasks, as described above.
 * <p>
 * The rationale for the exponential increase is twofold: (1) Executors should be added slowly
 * in the beginning in case the number of extra executors needed turns out to be small. Otherwise,
 * we may add more executors than we need just to remove them later. (2) Executors should be added
 * quickly over time in case the maximum number of executors is very high. Otherwise, it will take
 * a long time to ramp up under heavy workloads.
 * <p>
 * The remove policy is simpler: If an executor has been idle for K seconds, meaning it has not
 * been scheduled to run any tasks, then it is removed. Note that an executor caching any data
 * blocks will be removed if it has been idle for more than L seconds.
 * <p>
 * There is no retry logic in either case because we make the assumption that the cluster manager
 * will eventually fulfill all requests it receives asynchronously.
 * <p>
 * The relevant Spark properties include the following:
 * <p>
 *   spark.dynamicAllocation.enabled - Whether this feature is enabled
 *   spark.dynamicAllocation.minExecutors - Lower bound on the number of executors
 *   spark.dynamicAllocation.maxExecutors - Upper bound on the number of executors
 *   spark.dynamicAllocation.initialExecutors - Number of executors to start with
 * <p>
 *   spark.dynamicAllocation.executorAllocationRatio -
 *     This is used to reduce the parallelism of the dynamic allocation that can waste
 *     resources when tasks are small
 * <p>
 *   spark.dynamicAllocation.schedulerBacklogTimeout (M) -
 *     If there are backlogged tasks for this duration, add new executors
 * <p>
 *   spark.dynamicAllocation.sustainedSchedulerBacklogTimeout (N) -
 *     If the backlog is sustained for this duration, add more executors
 *     This is used only after the initial backlog timeout is exceeded
 * <p>
 *   spark.dynamicAllocation.executorIdleTimeout (K) -
 *     If an executor without caching any data blocks has been idle for this duration, remove it
 * <p>
 *   spark.dynamicAllocation.cachedExecutorIdleTimeout (L) -
 *     If an executor with caching data blocks has been idle for more than this duration,
 *     the executor will be removed
 * <p>
 */
  class ExecutorAllocationManager implements org.apache.spark.internal.Logging {
  /**
   * A listener that notifies the given allocation manager of when to add and remove executors.
   * <p>
   * This class is intentionally conservative in its assumptions about the relative ordering
   * and consistency of events returned by the listener.
   */
    class ExecutorAllocationListener extends org.apache.spark.scheduler.SparkListener {
    public   ExecutorAllocationListener ()  { throw new RuntimeException(); }
    public  void onSpeculativeTaskSubmitted (org.apache.spark.scheduler.SparkListenerSpeculativeTaskSubmitted speculativeTask)  { throw new RuntimeException(); }
    public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
    public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
    public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
    public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
    public  int pendingSpeculativeTasks ()  { throw new RuntimeException(); }
    /**
     * An estimate of the total number of pending tasks remaining for currently running stages. Does
     * not account for tasks which may have failed and been resubmitted.
     * <p>
     * Note: This is not thread-safe without the caller owning the <code>allocationManager</code> lock.
     * @return (undocumented)
     */
    public  int pendingTasks ()  { throw new RuntimeException(); }
    public  int totalPendingTasks ()  { throw new RuntimeException(); }
    /**
     * The number of tasks currently running across all stages.
     * Include running-but-zombie stage attempts
     * @return (undocumented)
     */
    public  int totalRunningTasks ()  { throw new RuntimeException(); }
    /**
     * Update the Executor placement hints (the number of tasks with locality preferences,
     * a map where each pair is a node and the number of tasks that would like to be scheduled
     * on that node).
     * <p>
     * These hints are updated when stages arrive and complete, so are not up-to-date at task
     * granularity within stages.
     */
    public  void updateExecutorPlacementHints ()  { throw new RuntimeException(); }
  }
  /**
   * Metric source for ExecutorAllocationManager to expose its internal executor allocation
   * status to MetricsSystem.
   * Note: These metrics heavily rely on the internal implementation of
   * ExecutorAllocationManager, metrics or value of metrics will be changed when internal
   * implementation is changed, so these metrics are not stable across Spark version.
   */
    class ExecutorAllocationManagerSource implements org.apache.spark.metrics.source.Source {
    public   ExecutorAllocationManagerSource ()  { throw new RuntimeException(); }
    public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
    public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  }
  static public  long NOT_SET ()  { throw new RuntimeException(); }
  public   ExecutorAllocationManager (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.SparkConf conf, scala.Option<org.apache.spark.ContextCleaner> cleaner, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public  org.apache.spark.ExecutorAllocationManager.ExecutorAllocationListener listener ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.dynalloc.ExecutorMonitor executorMonitor ()  { throw new RuntimeException(); }
  public  org.apache.spark.ExecutorAllocationManager.ExecutorAllocationManagerSource executorAllocationManagerSource ()  { throw new RuntimeException(); }
  /**
   * Register for scheduler callbacks to decide when to add and remove executors, and start
   * the scheduling task.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stop the allocation manager.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Reset the allocation manager when the cluster manager loses track of the driver's state.
   * This is currently only done in YARN client mode, when the AM is restarted.
   * <p>
   * This method forgets about any state about existing executors, and forces the scheduler to
   * re-evaluate the number of needed executors the next time it's run.
   */
  public  void reset ()  { throw new RuntimeException(); }
}
