package org.apache.spark.sql.execution.adaptive;
/**
 * A rule to optimize the shuffle reader to local reader as far as possible
 * when converting the 'SortMergeJoinExec' to 'BroadcastHashJoinExec' in runtime.
 * <p>
 * This rule can be divided into two steps:
 * Step1: Add the local reader in probe side and then check whether additional
 *       shuffle introduced. If introduced, we will revert all the local
 *       reader in probe side.
 * Step2: Add the local reader in build side and will not check whether
 *        additional shuffle introduced. Because the build side will not introduce
 *        additional shuffle.
 */
public  class OptimizeLocalShuffleReader extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   OptimizeLocalShuffleReader (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
