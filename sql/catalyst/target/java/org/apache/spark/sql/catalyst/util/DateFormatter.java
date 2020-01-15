package org.apache.spark.sql.catalyst.util;
public  interface DateFormatter extends scala.Serializable {
  public  int parse (java.lang.String s)  ;
  public  java.lang.String format (int days)  ;
}
