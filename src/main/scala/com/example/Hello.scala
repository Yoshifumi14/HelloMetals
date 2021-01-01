package com.example

object Hello extends App {
  val name = "Metals"
  println(HelloUtils.getGreetMessage(name))
}

object HelloUtils {
  val hello: String = "Hello"
  def getGreetMessage(name: String): String = hello + ", " + name + "."

}
