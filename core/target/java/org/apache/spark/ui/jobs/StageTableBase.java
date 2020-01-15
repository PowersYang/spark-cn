package org.apache.spark.ui.jobs;
  class StageTableBase {
  public   StageTableBase (org.apache.spark.status.AppStatusStore store, javax.servlet.http.HttpServletRequest request, scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stages, java.lang.String tableHeaderID, java.lang.String stageTag, java.lang.String basePath, java.lang.String subPath, boolean isFairScheduler, boolean killEnabled, boolean isFailedStage)  { throw new RuntimeException(); }
  public  long currentTime ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Iterable<java.lang.String> parameterOtherTable ()  { throw new RuntimeException(); }
  public  java.lang.String parameterStagePage ()  { throw new RuntimeException(); }
  public  java.lang.String parameterStagePageSize ()  { throw new RuntimeException(); }
  public  java.lang.String parameterStageSortColumn ()  { throw new RuntimeException(); }
  public  java.lang.String parameterStageSortDesc ()  { throw new RuntimeException(); }
  public  int stagePage ()  { throw new RuntimeException(); }
  public  int stagePageSize ()  { throw new RuntimeException(); }
  public  java.lang.String stageSortColumn ()  { throw new RuntimeException(); }
  public  boolean stageSortDesc ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> toNodeSeq ()  { throw new RuntimeException(); }
}
