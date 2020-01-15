package org.apache.spark.sql.catalyst.expressions;
/**
 * Common trait for {@link GetArrayItem} and {@link ElementAt}.
 */
public  interface GetArrayItemUtil {
  /** `Null` is returned for invalid ordinals. */
  public  boolean computeNullabilityFromArray (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression ordinal)  ;
}
