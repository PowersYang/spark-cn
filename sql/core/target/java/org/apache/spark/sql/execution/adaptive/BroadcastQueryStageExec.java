package org.apache.spark.sql.execution.adaptive;
/**
 * A broadcast query stage whose child is a {@link BroadcastExchangeExec}.
 */
public  class BroadcastQueryStageExec extends org.apache.spark.sql.execution.adaptive.QueryStageExec implements scala.Product, scala.Serializable {
  /**
   * Returns true if the plan is a {@link BroadcastQueryStageExec} or a reused
   * {@link BroadcastQueryStageExec}.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static public  boolean isBroadcastQueryStageExec (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.exchange.BroadcastExchangeExec plan ()  { throw new RuntimeException(); }
  // not preceding
  public   BroadcastQueryStageExec (int id, org.apache.spark.sql.execution.exchange.BroadcastExchangeExec plan)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<java.lang.Object> doMaterialize ()  { throw new RuntimeException(); }
  public  void cancel ()  { throw new RuntimeException(); }
}
