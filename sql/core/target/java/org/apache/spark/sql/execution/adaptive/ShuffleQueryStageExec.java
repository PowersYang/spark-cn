package org.apache.spark.sql.execution.adaptive;
/**
 * A shuffle query stage whose child is a {@link ShuffleExchangeExec}.
 */
public  class ShuffleQueryStageExec extends org.apache.spark.sql.execution.adaptive.QueryStageExec implements scala.Product, scala.Serializable {
  /**
   * Returns true if the plan is a {@link ShuffleQueryStageExec} or a reused {@link ShuffleQueryStageExec}.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static public  boolean isShuffleQueryStageExec (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.exchange.ShuffleExchangeExec plan ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleQueryStageExec (int id, org.apache.spark.sql.execution.exchange.ShuffleExchangeExec plan)  { throw new RuntimeException(); }
  // not preceding
  public  scala.concurrent.Future<org.apache.spark.MapOutputStatistics> mapOutputStatisticsFuture ()  { throw new RuntimeException(); }
  public  scala.concurrent.Future<java.lang.Object> doMaterialize ()  { throw new RuntimeException(); }
  public  void cancel ()  { throw new RuntimeException(); }
}
