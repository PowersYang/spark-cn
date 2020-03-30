package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A container for holding the view description(CatalogTable), and the output of the view. The
 * child should be a logical plan parsed from the <code>CatalogTable.viewText</code>, should throw an error
 * if the <code>viewText</code> is not defined.
 * This operator will be removed at the end of analysis stage.
 * <p>
 * param:  desc A view description(CatalogTable) that provides necessary information to resolve the
 *             view.
 * param:  output The output of a view operator, this is generated during planning the view, so that
 *               we are able to decouple the output from the underlying structure.
 * param:  child The logical plan of a view operator, it should be a logical plan parsed from the
 *              <code>CatalogTable.viewText</code>, should throw an error if the <code>viewText</code> is not defined.
 */
public  class View extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.analysis.MultiInstanceRelation, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable desc ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   View (org.apache.spark.sql.catalyst.catalog.CatalogTable desc, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newInstance ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString (int maxFields)  { throw new RuntimeException(); }
}
