package org.apache.spark.sql.catalyst.expressions;
public  class ExpressionSet implements scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.ExpressionSet apply (scala.collection.TraversableOnce<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
  protected  scala.collection.mutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> baseSet ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.Buffer<org.apache.spark.sql.catalyst.expressions.Expression> originals ()  { throw new RuntimeException(); }
  protected   ExpressionSet (scala.collection.mutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> baseSet, scala.collection.mutable.Buffer<org.apache.spark.sql.catalyst.expressions.Expression> originals)  { throw new RuntimeException(); }
  protected  void add (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  public  boolean contains (org.apache.spark.sql.catalyst.expressions.Expression elem)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Expression> iterator ()  { throw new RuntimeException(); }
  /**
   * Returns a string containing both the post {@link Canonicalize} expressions and the original
   * expressions in this set.
   * @return (undocumented)
   */
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
}
