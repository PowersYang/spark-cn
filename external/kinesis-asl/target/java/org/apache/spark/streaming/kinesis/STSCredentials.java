package org.apache.spark.streaming.kinesis;
/**
 * Returns an STSAssumeRoleSessionCredentialsProvider instance which assumes an IAM
 * role in order to authenticate against resources in an external account.
 */
 final class STSCredentials implements org.apache.spark.streaming.kinesis.SparkAWSCredentials, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String stsRoleArn ()  { throw new RuntimeException(); }
  public  java.lang.String stsSessionName ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> stsExternalId ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kinesis.SparkAWSCredentials longLivedCreds ()  { throw new RuntimeException(); }
  // not preceding
  public   STSCredentials (java.lang.String stsRoleArn, java.lang.String stsSessionName, scala.Option<java.lang.String> stsExternalId, org.apache.spark.streaming.kinesis.SparkAWSCredentials longLivedCreds)  { throw new RuntimeException(); }
  public  com.amazonaws.auth.AWSCredentialsProvider provider ()  { throw new RuntimeException(); }
}
