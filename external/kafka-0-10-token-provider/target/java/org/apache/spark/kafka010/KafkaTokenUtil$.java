package org.apache.spark.kafka010;
public  class KafkaTokenUtil$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaTokenUtil$ MODULE$ = null;
  public   KafkaTokenUtil$ ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.Text TOKEN_KIND ()  { throw new RuntimeException(); }
    org.apache.hadoop.io.Text getTokenService (java.lang.String identifier)  { throw new RuntimeException(); }
    scala.Tuple2<org.apache.hadoop.security.token.Token<org.apache.spark.kafka010.KafkaTokenUtil.KafkaDelegationTokenIdentifier>, java.lang.Object> obtainToken (org.apache.spark.SparkConf sparkConf, org.apache.spark.kafka010.KafkaTokenClusterConf clusterConf)  { throw new RuntimeException(); }
    void checkProxyUser ()  { throw new RuntimeException(); }
    java.util.Properties createAdminClientProperties (org.apache.spark.SparkConf sparkConf, org.apache.spark.kafka010.KafkaTokenClusterConf clusterConf)  { throw new RuntimeException(); }
  public  boolean isGlobalJaasConfigurationProvided ()  { throw new RuntimeException(); }
  public  java.lang.String getKeytabJaasParams (java.lang.String keyTab, java.lang.String principal, java.lang.String kerberosServiceName)  { throw new RuntimeException(); }
  /**
   * Krb5LoginModule package vary in different JVMs.
   * Please see Hadoop UserGroupInformation for further details.
   * @return (undocumented)
   */
  public  java.lang.String getKrb5LoginModuleName ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.kafka010.KafkaTokenClusterConf> findMatchingTokenClusterConfig (org.apache.spark.SparkConf sparkConf, java.lang.String bootStrapServers)  { throw new RuntimeException(); }
  public  java.lang.String getTokenJaasParams (org.apache.spark.kafka010.KafkaTokenClusterConf clusterConf)  { throw new RuntimeException(); }
  public  boolean isConnectorUsingCurrentToken (java.util.Map<java.lang.String, java.lang.Object> params, scala.Option<org.apache.spark.kafka010.KafkaTokenClusterConf> clusterConfig)  { throw new RuntimeException(); }
}
