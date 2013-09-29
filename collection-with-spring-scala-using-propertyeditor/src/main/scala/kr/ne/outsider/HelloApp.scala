package kr.ne.outsider

import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * Copyright (c) 2013 JeongHoon Byun aka "Outsider", <http://blog.outsider.ne.kr/>
 * Licensed under the MIT license.
 * <http://outsider.mit-license.org/>
 *
 * Author: Outsider
 * Date: 13. 9. 29.
 * Time: 오후 5:50
 */
object HelloApp extends App {
  val context = new ClassPathXmlApplicationContext("spring-config.xml")
  val helloService = context.getBean("helloService").asInstanceOf[HelloService]
  println(helloService.showSpringCamp)
}
