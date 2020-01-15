package org.apache.spark.resource;
public  class ResourceUtils {
  static public  java.lang.String DISCOVERY_SCRIPT ()  { throw new RuntimeException(); }
  static public  java.lang.String VENDOR ()  { throw new RuntimeException(); }
  static public  java.lang.String AMOUNT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.resource.ResourceRequest parseResourceRequest (org.apache.spark.SparkConf sparkConf, org.apache.spark.resource.ResourceID resourceId)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.resource.ResourceID> listResourceIds (org.apache.spark.SparkConf sparkConf, java.lang.String componentName)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.resource.ResourceRequest> parseAllResourceRequests (org.apache.spark.SparkConf sparkConf, java.lang.String componentName)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> parseResourceRequirements (org.apache.spark.SparkConf sparkConf, java.lang.String componentName)  { throw new RuntimeException(); }
  static public  boolean resourcesMeetRequirements (scala.collection.immutable.Map<java.lang.String, java.lang.Object> resourcesFree, scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> resourceRequirements)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.collection.Seq<T> withResourcesJson (java.lang.String resourcesFile, scala.Function1<java.lang.String, scala.collection.Seq<T>> extract)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.resource.ResourceAllocation> parseAllocatedFromJsonFile (java.lang.String resourcesFile)  { throw new RuntimeException(); }
  /**
   * Gets all allocated resource information for the input component from input resources file and
   * discover the remaining via discovery scripts.
   * It also verifies the resource allocation meets required amount for each resource.
   * @return a map from resource name to resource info
   * @param sparkConf (undocumented)
   * @param componentName (undocumented)
   * @param resourcesFileOpt (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> getOrDiscoverAllResources (org.apache.spark.SparkConf sparkConf, java.lang.String componentName, scala.Option<java.lang.String> resourcesFileOpt)  { throw new RuntimeException(); }
  static public  void logResourceInfo (java.lang.String componentName, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  static   org.apache.spark.resource.ResourceInformation discoverResource (org.apache.spark.resource.ResourceRequest resourceRequest)  { throw new RuntimeException(); }
  static public final  java.lang.String GPU ()  { throw new RuntimeException(); }
  static public final  java.lang.String FPGA ()  { throw new RuntimeException(); }
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
}
