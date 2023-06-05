package com.gu.helloApi

import org.scalatest.funsuite.AnyFunSuite

class ApiSpec extends AnyFunSuite {
  val api = new Api;
  test("Test Description: It Greets People") {
    assert(api.getDrummers().length == 500)
  }
}
