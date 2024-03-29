package org.apache.spark.sql.catalyst.optimizer;
/**
 * This rule is a variant of {@link PushPredicateThroughJoin} which can handle
 * pushing down Left semi and Left Anti joins below a join operator. The
 * allowable join types are:
 *  1) Inner
 *  2) Cross
 *  3) LeftOuter
 *  4) RightOuter
 * <p>
 * TODO:
 * Currently this rule can push down the left semi or left anti joins to either
 * left or right leg of the child join. This matches the behaviour of <code>PushPredicateThroughJoin</code>
 * when the lefi semi or left anti join is in expression form. We need to explore the possibility
 * to push the left semi/anti joins to both legs of join if the join condition refers to
 * both left and right legs of the child join.
 */
public  class PushLeftSemiLeftAntiThroughJoin {
  /**
   * Define an enumeration to identify whether a LeftSemi/LeftAnti join can be pushed down to
   * the left leg or the right leg of the join.
   */
  static public  class PushdownDirection$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PushdownDirection$ MODULE$ = null;
    public   PushdownDirection$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value TO_LEFT_BRANCH ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value TO_RIGHT_BRANCH ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value NONE ()  { throw new RuntimeException(); }
  }
  static public  class AllowedJoin$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AllowedJoin$ MODULE$ = null;
    public   AllowedJoin$ ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.Join> unapply (org.apache.spark.sql.catalyst.plans.logical.Join join)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
}
