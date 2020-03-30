package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link ChiSqSelector}.
 */
public final class ChiSqSelectorModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.ChiSqSelectorModel> implements org.apache.spark.ml.feature.ChiSqSelectorParams, org.apache.spark.ml.util.MLWritable {
  static   class ChiSqSelectorModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   ChiSqSelectorModelWriter (org.apache.spark.ml.feature.ChiSqSelectorModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.ChiSqSelectorModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.ChiSqSelectorModel load (java.lang.String path)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam numTopFeatures ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam percentile ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam fpr ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam fdr ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam fwe ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> selectorType ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
     ChiSqSelectorModel (java.lang.String uid, org.apache.spark.mllib.feature.ChiSqSelectorModel chiSqSelector)  { throw new RuntimeException(); }
  /** list of indices to select (filter). */
  public  int[] selectedFeatures ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelectorModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ChiSqSelectorModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ChiSqSelectorModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
