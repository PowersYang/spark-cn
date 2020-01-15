package org.apache.spark.sql.execution;
/**
 * The primary workflow for executing relational queries using Spark.  Designed to allow easy
 * access to the intermediate phases of query execution for developers.
 * <p>
 * While this is not a public class, we should avoid changing the function names for the sake of
 * changing them, because a lot of developers use the feature for debugging.
 */
public  class QueryExecution {
  /** A special namespace for commands that can be used to debug query execution. */
  public  class debug$ {
    public   debug$ ()  { throw new RuntimeException(); }
    /**
     * Prints to stdout all the generated code found in this plan (i.e. the output of each
     * WholeStageCodegen subtree).
     */
    public  void codegen ()  { throw new RuntimeException(); }
    /**
     * Get WholeStageCodegenExec subtrees and the codegen in a query plan
     * <p>
     * @return Sequence of WholeStageCodegen subtrees and corresponding codegen
     */
    public  scala.collection.Seq<scala.Tuple3<java.lang.String, java.lang.String, org.apache.spark.sql.catalyst.expressions.codegen.ByteCodeStats>> codegenToSeq ()  { throw new RuntimeException(); }
    /**
     * Dumps debug information about query execution into the specified file.
     * <p>
     * @param maxFields maximum number of fields converted to string representation.
     * @param path (undocumented)
     */
    public  void toFile (java.lang.String path, int maxFields)  { throw new RuntimeException(); }
  }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.QueryExecution.debug$ debug ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logical ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.QueryPlanningTracker tracker ()  { throw new RuntimeException(); }
  // not preceding
  public   QueryExecution (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logical, org.apache.spark.sql.catalyst.QueryPlanningTracker tracker)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.SparkPlanner planner ()  { throw new RuntimeException(); }
  public  void assertAnalyzed ()  { throw new RuntimeException(); }
  public  void assertSupported ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzed ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withCachedData ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan optimizedPlan ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan sparkPlan ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan executedPlan ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> toRdd ()  { throw new RuntimeException(); }
  /**
   * Prepares a planned {@link SparkPlan} for execution by inserting shuffle operations and internal
   * row format conversions as needed.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.execution.SparkPlan prepareForExecution (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  /** A sequence of rules that will be applied in order to the physical plan before execution. */
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> preparations ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString (boolean formatted)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String stringWithStats ()  { throw new RuntimeException(); }
}
