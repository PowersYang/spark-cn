package org.apache.spark.sql.execution;
public  class ExplainUtils {
  /**
   * Given a input physical plan, performs the following tasks.
   *   1. Generates the explain output for the input plan excluding the subquery plans.
   *   2. Generates the explain output for each subquery referenced in the plan.
   * @param plan (undocumented)
   * @param append (undocumented)
   */
  static public <T extends org.apache.spark.sql.catalyst.plans.QueryPlan<T>> void processPlan (scala.Function0<org.apache.spark.sql.catalyst.plans.QueryPlan<T>> plan, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> append)  { throw new RuntimeException(); }
  /**
   * Returns the operator identifier for the supplied plan by retrieving the
   * <code>operationId</code> tag value.<code>
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getOpId (org.apache.spark.sql.catalyst.plans.QueryPlan<?> plan)  { throw new RuntimeException(); }
  /**
   * Returns the operator identifier for the supplied plan by retrieving the
   * <code>codegenId</code> tag value.<code>
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getCodegenId (org.apache.spark.sql.catalyst.plans.QueryPlan<?> plan)  { throw new RuntimeException(); }
  static public  void removeTags (org.apache.spark.sql.catalyst.plans.QueryPlan<?> plan)  { throw new RuntimeException(); }
}
