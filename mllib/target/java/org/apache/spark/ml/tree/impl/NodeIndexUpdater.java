package org.apache.spark.ml.tree.impl;
/**
 * This is used by the node id cache to find the child id that a data point would belong to.
 * param:  split Split information.
 * param:  nodeIndex The current node index of a data point that this will update.
 */
  class NodeIndexUpdater implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.Split split ()  { throw new RuntimeException(); }
  public  int nodeIndex ()  { throw new RuntimeException(); }
  // not preceding
  public   NodeIndexUpdater (org.apache.spark.ml.tree.Split split, int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Determine a child node index based on the feature value and the split.
   * @param binnedFeature Binned feature value.
   * @param splits Split information to convert the bin indices to approximate feature values.
   * @return Child node index to update to.
   */
  public  int updateNodeIndex (int binnedFeature, org.apache.spark.ml.tree.Split[] splits)  { throw new RuntimeException(); }
}
