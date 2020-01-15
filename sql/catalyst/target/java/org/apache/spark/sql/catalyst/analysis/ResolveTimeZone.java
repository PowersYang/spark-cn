package org.apache.spark.sql.catalyst.analysis;
/**
 * Replace {@link TimeZoneAwareExpression} without timezone id by its copy with session local
 * time zone.
 */
public  class ResolveTimeZone extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolveTimeZone (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression resolveTimeZones (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
