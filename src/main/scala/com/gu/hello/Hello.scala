package com.gu.hello

import com.gu.helloApi.Api

object Hello {

  val drummerApi = new Api

  def sayHello(name: Option[String] = None): String = {
    name.map(a => s"Hello $a").getOrElse("Hello!")
  }

  def helloDrummer = {
    sayHello(drummerApi.getDrummers().headOption)
  }
}
