package org.apache.spark.streaming.kinesis;
/**
 * Returns AWSStaticCredentialsProvider constructed using basic AWS keypair. Falls back to using
 * DefaultCredentialsProviderChain if unable to construct a AWSCredentialsProviderChain
 * instance with the provided arguments (e.g. if they are null).
 */
 final class BasicCredentials implements org.apache.spark.streaming.kinesis.SparkAWSCredentials, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String awsAccessKeyId ()  { throw new RuntimeException(); }
  public  java.lang.String awsSecretKey ()  { throw new RuntimeException(); }
  // not preceding
  public   BasicCredentials (java.lang.String awsAccessKeyId, java.lang.String awsSecretKey)  { throw new RuntimeException(); }
  public  com.amazonaws.auth.AWSCredentialsProvider provider ()  { throw new RuntimeException(); }
}
