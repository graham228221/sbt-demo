package com.gu.hello

import org.scalatest.funsuite.AnyFunSuite

class HelloSpec extends AnyFunSuite {
  test("Test Description: It Greets People"){
    assert(Hello.sayHello(Some("graham"))=="Hello graham")
  }
}
