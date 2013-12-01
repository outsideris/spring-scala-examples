package kr.ne.outsider

import org.springframework.scala.context.function.FunctionalConfigApplicationContext

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
  val context = FunctionalConfigApplicationContext[ScalaExampleConfiguration]
//  context.registerClass[ScalaExampleConfiguration]
//  context.registerClasses(classOf[MyConfiguration])
//  context.registerConfigurations(new MyConfiguration)
  val helloService = context.getBean(classOf[HelloService])
  println(helloService.showSpringCamp)
}
