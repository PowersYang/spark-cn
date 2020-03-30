package org.apache.spark.sql.execution.ui;
public  class LiveStageMetrics {
  // not preceding
  public   LiveStageMetrics (int attemptId, int numTasks, scala.collection.immutable.Set<java.lang.Object> accumulatorIds)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> accumulatorIds ()  { throw new RuntimeException(); }
  public  int attemptId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.Object, long[]>> metricValues ()  { throw new RuntimeException(); }
  public  int numTasks ()  { throw new RuntimeException(); }
  public  void registerTask (long taskId, int taskIdx)  { throw new RuntimeException(); }
  public  void updateTaskMetrics (long taskId, int eventIdx, boolean finished, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumUpdates)  { throw new RuntimeException(); }
}
