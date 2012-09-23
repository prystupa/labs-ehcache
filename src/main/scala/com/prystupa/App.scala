package com.prystupa

import net.sf.ehcache.{Element, CacheManager}

object App {

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {

    val cache = CacheManager.create()
    cache.addCache("testCache")
    val test = cache.getCache("testCache")

    test.put(new Element("my key", "my value"))

    val element = test.get("my key")
    println(element.toString)
  }

}
