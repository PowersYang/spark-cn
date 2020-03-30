package org.apache.spark.ml.evaluation;
/**
 * Evaluator for binary classification, which expects two input columns: rawPrediction and label.
 * The rawPrediction column can be of type double (binary 0/1 prediction, or probability of label 1)
 * or of type vector (length-2 vector of raw predictions, scores, or label probabilities).
 */
public  class BinaryClassificationEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasRawPredictionCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   BinaryClassificationEvaluator (java.lang.String uid)  { throw new RuntimeException(); }
  public   BinaryClassificationEvaluator ()  { throw new RuntimeException(); }
  /**
   * param for metric name in evaluation (supports <code>"areaUnderROC"</code> (default), <code>"areaUnderPR"</code>)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> metricName ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setMetricName (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * param for number of bins to down-sample the curves (ROC curve, PR curve) in area
   * computation. If 0, no down-sampling will occur.
   * Default: 1000.
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numBins ()  { throw new RuntimeException(); }
  /** @group expertGetParam */
  public  int getNumBins ()  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setNumBins (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setRawPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  boolean isLargerBetter ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
