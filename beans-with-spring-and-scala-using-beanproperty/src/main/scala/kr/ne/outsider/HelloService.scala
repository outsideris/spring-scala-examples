package kr.ne.outsider

/**
 * Copyright (c) 2013 JeongHoon Byun aka "Outsider", <http://blog.outsider.ne.kr/>
 * Licensed under the MIT license.
 * <http://outsider.mit-license.org/>
 *
 * Author: Outsider
 * Date: 13. 9. 29.
 * Time: 오후 6:06
 */
class HelloService(val conference:Conference) {
  def showSpringCamp = {
    s"${conference.name}\n${conference.when} / ${conference.where}"
  }
}
