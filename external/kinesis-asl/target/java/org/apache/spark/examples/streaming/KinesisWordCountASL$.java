package org.apache.spark.examples.streaming;
/**
 * Consumes messages from a Amazon Kinesis streams and does wordcount.
 * <p>
 * This example spins up 1 Kinesis Receiver per shard for the given stream.
 * It then starts pulling from the last checkpointed sequence number of the given stream.
 * <p>
 * Usage: KinesisWordCountASL <app-name> <stream-name> <endpoint-url> <region-name>
 *   <app-name> is the name of the consumer app, used to track the read data in DynamoDB
 *   <stream-name> name of the Kinesis stream (ie. mySparkStream)
 *   <endpoint-url> endpoint of the Kinesis service
 *     (e.g. https://kinesis.us-east-1.amazonaws.com)
 * <p>
 * Example:
 *      # export AWS keys if necessary
 *      $ export AWS_ACCESS_KEY_ID=<your-access-key>
 *      $ export AWS_SECRET_KEY=<your-secret-key>
 * <p>
 *      # run the example
 *      $ SPARK_HOME/bin/run-example  streaming.KinesisWordCountASL myAppName  mySparkStream \
 *              https://kinesis.us-east-1.amazonaws.com
 * <p>
 * There is a companion helper class called KinesisWordProducerASL which puts dummy data
 * onto the Kinesis stream.
 * <p>
 * This code uses the DefaultAWSCredentialsProviderChain to find credentials
 * in the following order:
 *    Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY
 *    Java System Properties - aws.accessKeyId and aws.secretKey
 *    Credential profiles file - default location (~/.aws/credentials) shared by all AWS SDKs
 *    Instance profile credentials - delivered through the Amazon EC2 metadata service
 * For more information, see
 * http://docs.aws.amazon.com/AWSSdkDocsJava/latest/DeveloperGuide/credentials.html
 * <p>
 * See http://spark.apache.org/docs/latest/streaming-kinesis-integration.html for more details on
 * the Kinesis Spark Streaming integration.
 */
public  class KinesisWordCountASL$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KinesisWordCountASL$ MODULE$ = null;
  public   KinesisWordCountASL$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
