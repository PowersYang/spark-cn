package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Base trait for DataSourceV2 write commands
 */
public  interface V2WriteCommand extends org.apache.spark.sql.catalyst.plans.logical.Command {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  ;
  public  boolean outputResolved ()  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  ;
  public  boolean resolved ()  ;
  public  org.apache.spark.sql.catalyst.analysis.NamedRelation table ()  ;
}
