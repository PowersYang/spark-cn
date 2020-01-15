package org.apache.spark.status;
/**
 * A Spark listener that writes application information to a data store. The types written to the
 * store are defined in the <code>storeTypes.scala</code> file and are based on the public REST API.
 * <p>
 * param:  lastUpdateTime When replaying logs, the log's last update time, so that the duration of
 *                       unfinished tasks can be more accurately calculated (see SPARK-21922).
 */
  class AppStatusListener extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.internal.Logging {
  public   AppStatusListener (org.apache.spark.status.ElementTrackingStore kvstore, org.apache.spark.SparkConf conf, boolean live, scala.Option<org.apache.spark.status.AppStatusSource> appStatusSource, scala.Option<java.lang.Object> lastUpdateTime)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart event)  { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate event)  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd event)  { throw new RuntimeException(); }
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded event)  { throw new RuntimeException(); }
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved event)  { throw new RuntimeException(); }
  public  void onExecutorBlacklisted (org.apache.spark.scheduler.SparkListenerExecutorBlacklisted event)  { throw new RuntimeException(); }
  public  void onExecutorBlacklistedForStage (org.apache.spark.scheduler.SparkListenerExecutorBlacklistedForStage event)  { throw new RuntimeException(); }
  public  void onNodeBlacklistedForStage (org.apache.spark.scheduler.SparkListenerNodeBlacklistedForStage event)  { throw new RuntimeException(); }
  public  void onExecutorUnblacklisted (org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted event)  { throw new RuntimeException(); }
  public  void onNodeBlacklisted (org.apache.spark.scheduler.SparkListenerNodeBlacklisted event)  { throw new RuntimeException(); }
  public  void onNodeUnblacklisted (org.apache.spark.scheduler.SparkListenerNodeUnblacklisted event)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart event)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd event)  { throw new RuntimeException(); }
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted event)  { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart event)  { throw new RuntimeException(); }
  public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult event)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd event)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted event)  { throw new RuntimeException(); }
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded event)  { throw new RuntimeException(); }
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved event)  { throw new RuntimeException(); }
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD event)  { throw new RuntimeException(); }
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate event)  { throw new RuntimeException(); }
  public  void onStageExecutorMetrics (org.apache.spark.scheduler.SparkListenerStageExecutorMetrics executorMetrics)  { throw new RuntimeException(); }
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated event)  { throw new RuntimeException(); }
  /**
   * Shortcut to get active stages quickly in a live application, for use by the console
   * progress bar.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> activeStages ()  { throw new RuntimeException(); }
}
