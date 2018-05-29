package com.pp

/**
 * case class 和calss的比较
 *
 */
object caseClass_class extends Application {
  case class Iteblog(name:String)
  val iteblog = Iteblog("iteblog_hadoop")
  val iteblog1 = new Iteblog("iteblog_hadoop")
  println(iteblog+"|"+iteblog1)
}
