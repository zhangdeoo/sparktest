package com.pp

import java.io.{ByteArrayOutputStream, ObjectOutputStream}

import io.netty.util.internal.chmv8.ConcurrentHashMapV8.Fun

/**
 * case class 和calss的比较
 *
 */
class traditionClass(name: String)

case class Iteblog(name: String)

object caseClass_class {
  def main(args: Array[String]): Unit = {
    val iteblog = Iteblog("iteblog_hadoop")
    val iteblog1 = new Iteblog("iteblog_hadoop")
    val t1 = new traditionClass("traditionClass")
    val t2 = new traditionClass("traditionClass")
    println("1.case class 可以不需要new,也可以new,实现了toString:" + iteblog + "|" + iteblog1)
    println("2.case class 实现了equals:" + iteblog == iteblog1)
    println("3.case class 实现了hashCode:" + iteblog.hashCode())
    println("4.默认是可以序列化的，也就是实现了Serializable ")
    val bos = new ByteArrayOutputStream
    val oos = new ObjectOutputStream(bos)
    //可以执行
    oos.writeObject(iteblog)
    //报错java.io.NotSerializableException: com.pp.traditionClass
    //    oos.writeObject(t1)
    println("5.自动从scala.Product中继承一些函数")
    println("6.case class构造函数的参数是public级别的，我们可以直接访问")
    println(iteblog.name)
    println("7、支持模式匹配")

  }


}
