package org.apache.spark.sql.execution.datasources.v2;
public  class PushDownUtils {
  /**
   * Pushes down filters to the data source reader
   * <p>
   * @return pushed filter and post-scan filters.
   * @param scanBuilder (undocumented)
   * @param filters (undocumented)
   */
  static public  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> pushFilters (org.apache.spark.sql.connector.read.ScanBuilder scanBuilder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  /**
   * Applies column pruning to the data source, w.r.t. the references of the given expressions.
   * <p>
   * @return the created <code>ScanConfig</code>(since column pruning is the last step of operator pushdown),
   *         and new output attributes after column pruning.
   * @param scanBuilder (undocumented)
   * @param relation (undocumented)
   * @param exprs (undocumented)
   */
  static public  scala.Tuple2<org.apache.spark.sql.connector.read.Scan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference>> pruneColumns (org.apache.spark.sql.connector.read.ScanBuilder scanBuilder, org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
}
