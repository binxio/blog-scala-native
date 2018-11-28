package com.github.binxio

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val x: Option[Int] = Option.empty[Int]
    println(x.fold("empty")(_.toString))
  }
}
