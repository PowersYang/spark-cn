package org.apache.spark.ml.classification;
/**
 * Classification model based on the Multilayer Perceptron.
 * Each layer has sigmoid activation function, output layer has softmax.
 * <p>
 * param:  uid uid
 * param:  layers array of layer sizes including input and output layers
 * param:  weights the weights of layers
 */
public  class MultilayerPerceptronClassificationModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel> implements scala.Serializable, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link MultilayerPerceptronClassificationModel} */
  static   class MultilayerPerceptronClassificationModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   MultilayerPerceptronClassificationModelWriter (org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel load (java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int[] layers ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector weights ()  { throw new RuntimeException(); }
  // not preceding
     MultilayerPerceptronClassificationModel (java.lang.String uid, int[] layers, org.apache.spark.ml.linalg.Vector weights)  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
    org.apache.spark.ml.ann.TopologyModel mlpModel ()  { throw new RuntimeException(); }
  /**
   * Returns layers in a Java List.
   * @return (undocumented)
   */
    java.util.List<java.lang.Object> javaLayers ()  { throw new RuntimeException(); }
  /**
   * Predict label for the given features.
   * This internal method is used to implement <code>transform()</code> and output {@link predictionCol}.
   * @param features (undocumented)
   * @return (undocumented)
   */
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
}
