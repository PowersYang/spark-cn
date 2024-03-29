package org.apache.spark.sql.catalyst.optimizer;
/**
 * Converts local operations (i.e. ones that don't require data exchange) on <code>LocalRelation</code> to
 * another <code>LocalRelation</code>.
 */
public  class ConvertToLocalRelation$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ConvertToLocalRelation$ MODULE$ = null;
  public   ConvertToLocalRelation$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
