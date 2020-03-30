package org.apache.spark.sql.catalyst.optimizer;
/**
 * This aims to handle a nested column aliasing pattern inside the <code>ColumnPruning</code> optimizer rule.
 * If a project or its child references to nested fields, and not all the fields
 * in a nested attribute are used, we can substitute them by alias attributes; then a project
 * of the nested fields as aliases on the children of the child will be created.
 */
public  class NestedColumnAliasing$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NestedColumnAliasing$ MODULE$ = null;
  public   NestedColumnAliasing$ ()  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExtractValue, org.apache.spark.sql.catalyst.expressions.Alias>, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExprId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias>>>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Replace nested columns to prune unused nested columns later.
   * @param plan (undocumented)
   * @param nestedFieldToAlias (undocumented)
   * @param attrToAliases (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan replaceToAliases (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExtractValue, org.apache.spark.sql.catalyst.expressions.Alias> nestedFieldToAlias, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExprId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias>> attrToAliases)  { throw new RuntimeException(); }
  /**
   * Return a replaced project list.
   * @param projectList (undocumented)
   * @param nestedFieldToAlias (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> getNewProjectList (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExtractValue, org.apache.spark.sql.catalyst.expressions.Alias> nestedFieldToAlias)  { throw new RuntimeException(); }
  /**
   * Return a plan with new children replaced with aliases.
   * @param plan (undocumented)
   * @param attrToAliases (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan replaceChildrenWithAliases (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExprId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias>> attrToAliases)  { throw new RuntimeException(); }
  /**
   * Return two maps in order to replace nested fields to aliases.
   * <p>
   * 1. ExtractValue -> Alias: A new alias is created for each nested field.
   * 2. ExprId -> Seq[Alias]: A reference attribute has multiple aliases pointing it.
   * @param exprList (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<scala.Tuple2<scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExtractValue, org.apache.spark.sql.catalyst.expressions.Alias>, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExprId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias>>>> getAliasSubMap (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprList)  { throw new RuntimeException(); }
  /**
   * This is a while-list for pruning nested fields at <code>Generator</code>.
   * @param g (undocumented)
   * @return (undocumented)
   */
  public  boolean canPruneGenerator (org.apache.spark.sql.catalyst.expressions.Generator g)  { throw new RuntimeException(); }
}
