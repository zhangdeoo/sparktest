package com.pp

/**
  * Created by Administrator on 2018/5/25.
  */
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.CarbonSession._
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
object sp {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("123")
    val sc = new SparkContext(conf)
    val carbon=SparkSession .builder().appName("Spark SQL basic example").getOrCreateCarbonSession("hdfs://192.168.40.130:9000/data/carbondata/pt/order_detail.csv")
    import carbon.implicits._
    carbon.read.csv("hdfs://192.168.40.130:9000/data/carbondata/pt/order_detail.csv").show()

//    val carbon = spark.builder().config(sc.getConf).getOrCreateCarbonSession("hdfs://192.168.40.130:9000/data/carbondata/pt/order_detail.csv")
//    carbon.sql("CREATE TABLE " +
//      " IF NOT EXISTS pt.order_detail " +
//      "( id BIGINT," +
//      " order_code STRING, " +
//      "sales_area_id INT, " +
//      "sales_id INT, " +
//      "order_inputer INT, " +
//      "pro_type STRING, " +
//      "currency INT, " +
//      "exchange_rate DECIMAL, " +
//      "unit_cost_price DECIMAL, " +
//      "unit_selling_price DECIMAL, " +
//      "order_num INTEGER, " +
//      "order_amount DECIMAL, " +
//      "order_discount DOUBLE, " +
//      "order_account_amount DECIMAL, " +
//      "order_time TIMESTAMP, " +
//      "delivery_channel INT, " +
//      "delivery_address STRING, " +
//      "recipients STRING, " +
//      "contact STRING, " +
//      "delivery_date DATE, " +
//      "comments STRING ) " +
//      "STORED BY 'carbondata' " +
//      "TBLPROPERTIES ( 'COLUMN_GROUPS' = '(recipients,contact)', " +
//      " 'DICTIONARY_EXCLUDE' = 'comments', " +
//      " 'DICTIONARY_INCLUDE' = 'sales_area_id,sales_id', " +
//      " 'NO_INVERTED_INDEX' = 'id,order_code' )").show()
  }
}
