package org.apache.spark.sql.execution.streaming.state;
/** Classes representing messages */
public  class ReportActiveInstance implements org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStoreProviderId storeId ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  // not preceding
  public   ReportActiveInstance (org.apache.spark.sql.execution.streaming.state.StateStoreProviderId storeId, java.lang.String host, java.lang.String executorId)  { throw new RuntimeException(); }
}
