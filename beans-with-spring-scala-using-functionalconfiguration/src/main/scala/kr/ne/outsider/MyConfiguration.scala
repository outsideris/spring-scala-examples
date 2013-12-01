package kr.ne.outsider

import org.springframework.scala.
           context.function.FunctionalConfiguration
import org.springframework.beans.factory.config.BeanDefinition

/**
 * Copyright (c) 2013 JeongHoon Byun aka "Outsider", <http://blog.outsider.ne.kr/>
 * Licensed under the MIT license.
 * <http://outsider.mit-license.org/>
 *
 * Author: Outsider
 * Date: 13. 9. 29.
 * Time: 오후 9:54
 */
class ScalaExampleConfiguration
        extends FunctionalConfiguration {

//  val conference = bean("conference", aliases = Seq("conf"), scope = BeanDefinition.SCOPE_SINGLETON) {
  val conference = bean() {
    val c = new Conference("SpringCamp")
    c.when = "2013-10-13"
    c.where = "코엑스"
    c
  }

  bean("helloService") {
    new HelloService(conference())
  }
}
