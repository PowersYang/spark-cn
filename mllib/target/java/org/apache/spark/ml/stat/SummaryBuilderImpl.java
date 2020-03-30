package org.apache.spark.ml.stat;
  class SummaryBuilderImpl extends org.apache.spark.ml.stat.SummaryBuilder {
  static public  class Mean$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Mean$ MODULE$ = null;
    public   Mean$ ()  { throw new RuntimeException(); }
  }
  static public  class Variance$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Variance$ MODULE$ = null;
    public   Variance$ ()  { throw new RuntimeException(); }
  }
  static public  class Count$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Count$ MODULE$ = null;
    public   Count$ ()  { throw new RuntimeException(); }
  }
  static public  class NumNonZeros$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NumNonZeros$ MODULE$ = null;
    public   NumNonZeros$ ()  { throw new RuntimeException(); }
  }
  static public  class Max$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Max$ MODULE$ = null;
    public   Max$ ()  { throw new RuntimeException(); }
  }
  static public  class Min$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Min$ MODULE$ = null;
    public   Min$ ()  { throw new RuntimeException(); }
  }
  static public  class NormL2$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NormL2$ MODULE$ = null;
    public   NormL2$ ()  { throw new RuntimeException(); }
  }
  static public  class NormL1$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NormL1$ MODULE$ = null;
    public   NormL1$ ()  { throw new RuntimeException(); }
  }
  static public  class ComputeMean$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeMean$ MODULE$ = null;
    public   ComputeMean$ ()  { throw new RuntimeException(); }
  }
  static public  class ComputeM2n$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeM2n$ MODULE$ = null;
    public   ComputeM2n$ ()  { throw new RuntimeException(); }
  }
  static public  class ComputeM2$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeM2$ MODULE$ = null;
    public   ComputeM2$ ()  { throw new RuntimeException(); }
  }
  static public  class ComputeL1$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeL1$ MODULE$ = null;
    public   ComputeL1$ ()  { throw new RuntimeException(); }
  }
  static public  class ComputeWeightSum$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeWeightSum$ MODULE$ = null;
    public   ComputeWeightSum$ ()  { throw new RuntimeException(); }
  }
  static public  class ComputeNNZ$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeNNZ$ MODULE$ = null;
    public   ComputeNNZ$ ()  { throw new RuntimeException(); }
  }
  static public  class ComputeMax$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeMax$ MODULE$ = null;
    public   ComputeMax$ ()  { throw new RuntimeException(); }
  }
  static public  class ComputeMin$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeMin$ MODULE$ = null;
    public   ComputeMin$ ()  { throw new RuntimeException(); }
  }
  /**
   * The metrics that are currently implemented.
   */
  static public  interface Metric extends java.io.Serializable {
  }
  /**
   * The running metrics that are going to be computed.
   * <p>
   * There is a bipartite graph between the metrics and the computed metrics.
   */
  static public  interface ComputeMetric extends java.io.Serializable {
  }
  static   class SummarizerBuffer implements java.io.Serializable {
    public   SummarizerBuffer (scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.Metric> requestedMetrics, scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric> requestedCompMetrics)  { throw new RuntimeException(); }
    public   SummarizerBuffer ()  { throw new RuntimeException(); }
    /**
     * Add a new sample to this summarizer, and update the statistical summary.
     * @param instance (undocumented)
     * @param weight (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.ml.stat.SummaryBuilderImpl.SummarizerBuffer add (org.apache.spark.ml.linalg.Vector instance, double weight)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.stat.SummaryBuilderImpl.SummarizerBuffer add (org.apache.spark.ml.linalg.Vector instance)  { throw new RuntimeException(); }
    /**
     * Sample size.
     * @return (undocumented)
     */
    public  long count ()  { throw new RuntimeException(); }
    /**
     * Maximum value of each dimension.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.Vector max ()  { throw new RuntimeException(); }
    /**
     * Sample mean of each dimension.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.Vector mean ()  { throw new RuntimeException(); }
    /**
     * Merge another SummarizerBuffer, and update the statistical summary.
     * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
     * <p>
     * @param other The other MultivariateOnlineSummarizer to be merged.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.stat.SummaryBuilderImpl.SummarizerBuffer merge (org.apache.spark.ml.stat.SummaryBuilderImpl.SummarizerBuffer other)  { throw new RuntimeException(); }
    /**
     * Minimum value of each dimension.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.Vector min ()  { throw new RuntimeException(); }
    /**
     * L1 norm of each dimension.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.Vector normL1 ()  { throw new RuntimeException(); }
    /**
     * L2 (Euclidean) norm of each dimension.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.Vector normL2 ()  { throw new RuntimeException(); }
    /**
     * Number of nonzero elements in each dimension.
     * <p>
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.Vector numNonzeros ()  { throw new RuntimeException(); }
    /**
     * Unbiased estimate of sample variance of each dimension.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.Vector variance ()  { throw new RuntimeException(); }
  }
  static public  scala.collection.Seq<java.lang.String> implementedMetrics ()  { throw new RuntimeException(); }
  static public  scala.Tuple2<scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.Metric>, scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric>> getRelevantMetrics (scala.collection.Seq<java.lang.String> requested) throws java.lang.IllegalArgumentException { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType structureForMetrics (scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.Metric> metrics)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
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
  public   SummaryBuilderImpl (scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.Metric> requestedMetrics, scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric> requestedCompMetrics)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Column summary (org.apache.spark.sql.Column featuresCol, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
}
