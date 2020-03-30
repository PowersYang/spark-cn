package org.apache.spark.sql.execution.window;
public abstract class WindowExecBase extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode {
  public   WindowExecBase (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> windowExpression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionSpec, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> orderSpec, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  /**
   * Create the resulting projection.
   * <p>
   * This method uses Code Generation. It can only be used on the executor side.
   * <p>
   * @param expressions unbound ordered function expressions.
   * @return the final resulting projection.
   */
  protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection createResultProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.Seq<scala.Tuple2<scala.collection.mutable.Buffer<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.execution.window.WindowFunctionFrame>>> windowFrameExpressionFactoryPairs ()  { throw new RuntimeException(); }
}
