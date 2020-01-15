package org.apache.spark.ml.regression;
/**
 * Fit a parametric survival regression model named accelerated failure time (AFT) model
 * (see <a href="https://en.wikipedia.org/wiki/Accelerated_failure_time_model">
 * Accelerated failure time model (Wikipedia)</a>)
 * based on the Weibull distribution of the survival time.
 */
public  class AFTSurvivalRegression extends org.apache.spark.ml.Estimator<org.apache.spark.ml.regression.AFTSurvivalRegressionModel> implements org.apache.spark.ml.regression.AFTSurvivalRegressionParams, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.internal.Logging {
  static public  org.apache.spark.ml.regression.AFTSurvivalRegression load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> censorCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleArrayParam quantileProbabilities ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> quantilesCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   AFTSurvivalRegression (java.lang.String uid)  { throw new RuntimeException(); }
  public   AFTSurvivalRegression ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setCensorCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setQuantileProbabilities (double[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setQuantilesCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set if we should fit the intercept
   * Default is true.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setFitIntercept (boolean value)  { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations.
   * Default is 100.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setMaxIter (int value)  { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations.
   * Smaller value will lead to higher accuracy with the cost of more iterations.
   * Default is 1E-6.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setTol (double value)  { throw new RuntimeException(); }
  /**
   * Suggested depth for treeAggregate (greater than or equal to 2).
   * If the dimensions of features or the number of partitions are large,
   * this param could be adjusted to a larger size.
   * Default is 2.
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.AFTSurvivalRegression setAggregationDepth (int value)  { throw new RuntimeException(); }
  /**
   * Extract {@link featuresCol}, {@link labelCol} and {@link censorCol} from input dataset,
   * and put it in an RDD with strong types.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.rdd.RDD<org.apache.spark.ml.regression.AFTPoint> extractAFTPoints (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.AFTSurvivalRegression copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
