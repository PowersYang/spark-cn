package org.apache.spark.sql.execution;
/**
 * Accumulator that computes a global aggregate.
 */
public  class AggregatingAccumulator extends org.apache.spark.util.AccumulatorV2<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> {
  /**
   * Create an aggregating accumulator for the given functions and input schema.
   * @param functions (undocumented)
   * @param inputAttributes (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.AggregatingAccumulator apply (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> functions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputAttributes)  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  public  boolean isZero ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.AggregatingAccumulator copyAndReset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.AggregatingAccumulator copy ()  { throw new RuntimeException(); }
  public  void add (org.apache.spark.sql.catalyst.InternalRow v)  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.util.AccumulatorV2<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> other)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow value ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
}
