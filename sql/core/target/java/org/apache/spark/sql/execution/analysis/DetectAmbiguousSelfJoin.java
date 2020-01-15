package org.apache.spark.sql.execution.analysis;
/**
 * Detects ambiguous self-joins, so that we can fail the query instead of returning confusing
 * results.
 * <p>
 * Dataset column reference is simply an {@link AttributeReference} that is returned by <code>Dataset#col</code>.
 * Most of time we don't need to do anything special, as {@link AttributeReference} can point to
 * the column precisely. However, in case of self-join, the analyzer generates
 * {@link AttributeReference} with new expr IDs for the right side plan of the join. If the Dataset
 * column reference points to a column in the right side plan of a self-join, users will get
 * unexpected result because the column reference can't match the newly generated
 * {@link AttributeReference}.
 * <p>
 * Note that, this rule removes all the Dataset id related metadata from <code>AttributeReference</code>, so
 * that they don't exist after analyzer.
 */
public  class DetectAmbiguousSelfJoin extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  public  class LogicalPlanWithDatasetId {
    static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, java.lang.Object>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan p)  { throw new RuntimeException(); }
  }
  public  class LogicalPlanWithDatasetId$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LogicalPlanWithDatasetId$ MODULE$ = null;
    public   LogicalPlanWithDatasetId$ ()  { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, java.lang.Object>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan p)  { throw new RuntimeException(); }
  }
  public  class AttrWithCast {
    static public  scala.Option<org.apache.spark.sql.catalyst.expressions.AttributeReference> unapply (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  }
  public  class AttrWithCast$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AttrWithCast$ MODULE$ = null;
    public   AttrWithCast$ ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.expressions.AttributeReference> unapply (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.analysis.DetectAmbiguousSelfJoin.AttrWithCast$ AttrWithCast ()  { throw new RuntimeException(); }
  public   DetectAmbiguousSelfJoin (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.analysis.DetectAmbiguousSelfJoin.LogicalPlanWithDatasetId$ LogicalPlanWithDatasetId ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
