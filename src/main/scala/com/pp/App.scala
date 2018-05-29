package com.pp

/**
 * Hello world!
 *
 */
object App extends Application {
  case class Iteblog(name:String)
  val iteblog = Iteblog("iteblog_hadoop")
  val iteblog1 = new Iteblog("iteblog_hadoop")
  println(iteblog+"|"+iteblog1)
}
