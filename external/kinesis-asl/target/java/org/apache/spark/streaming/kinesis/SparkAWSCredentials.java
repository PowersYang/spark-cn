package org.apache.spark.streaming.kinesis;
/**
 * Serializable interface providing a method executors can call to obtain an
 * AWSCredentialsProvider instance for authenticating to AWS services.
 */
public  interface SparkAWSCredentials extends scala.Serializable {
  /**
   * Builder for {@link SparkAWSCredentials} instances.
   * <p>
   * @since 2.2.0
   */
  static public  class Builder {
    public   Builder ()  { throw new RuntimeException(); }
    /**
     * Use a basic AWS keypair for long-lived authorization.
     * <p>
     * @note The given AWS keypair will be saved in DStream checkpoints if checkpointing is
     * enabled. Make sure that your checkpoint directory is secure. Prefer using the
     * default provider chain instead if possible
     * (http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html#credentials-default).
     * <p>
     * @param accessKeyId AWS access key ID
     * @param secretKey AWS secret key
     * @return Reference to this {@link SparkAWSCredentials.Builder}
     */
    public  org.apache.spark.streaming.kinesis.SparkAWSCredentials.Builder basicCredentials (java.lang.String accessKeyId, java.lang.String secretKey)  { throw new RuntimeException(); }
    /**
     * Returns the appropriate instance of {@link SparkAWSCredentials} given the configured
     * parameters.
     * <p>
     * - The long-lived credentials will either be {@link DefaultCredentials} or {@link BasicCredentials}
     *   if they were provided.
     * <p>
     * - If STS credentials were provided, the configured long-lived credentials will be added to
     *   them and the result will be returned.
     * <p>
     * - The long-lived credentials will be returned otherwise.
     * <p>
     * @return {@link SparkAWSCredentials} to use for configured parameters
     */
    public  org.apache.spark.streaming.kinesis.SparkAWSCredentials build ()  { throw new RuntimeException(); }
    /**
     * Use STS to assume an IAM role for temporary session-based authentication. Will use configured
     * long-lived credentials for authorizing to STS itself (either the default provider chain
     * or a configured keypair).
     * <p>
     * @param roleArn ARN of IAM role to assume via STS
     * @param sessionName Name to use for the STS session
     * @return Reference to this {@link SparkAWSCredentials.Builder}
     */
    public  org.apache.spark.streaming.kinesis.SparkAWSCredentials.Builder stsCredentials (java.lang.String roleArn, java.lang.String sessionName)  { throw new RuntimeException(); }
    /**
     * Use STS to assume an IAM role for temporary session-based authentication. Will use configured
     * long-lived credentials for authorizing to STS itself (either the default provider chain
     * or a configured keypair). STS will validate the provided external ID with the one defined
     * in the trust policy of the IAM role to be assumed (if one is present).
     * <p>
     * @param roleArn ARN of IAM role to assume via STS
     * @param sessionName Name to use for the STS session
     * @param externalId External ID to validate against assumed IAM role's trust policy
     * @return Reference to this {@link SparkAWSCredentials.Builder}
     */
    public  org.apache.spark.streaming.kinesis.SparkAWSCredentials.Builder stsCredentials (java.lang.String roleArn, java.lang.String sessionName, java.lang.String externalId)  { throw new RuntimeException(); }
  }
  /**
   * Return an AWSCredentialProvider instance that can be used by the Kinesis Client
   * Library to authenticate to AWS services (Kinesis, CloudWatch and DynamoDB).
   * @return (undocumented)
   */
  public  com.amazonaws.auth.AWSCredentialsProvider provider ()  ;
}
