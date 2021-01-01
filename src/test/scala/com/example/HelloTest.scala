package com.example

import org.scalatest.funsuite.AnyFunSuite

class HelloTest extends AnyFunSuite {
  test("HelloUtils.getGreetMessage: sample test") {
    val name = "NAME"
    val target = HelloUtils.getGreetMessage(name)
    assert(target == "Hello, " + name + ".")
  }
}
