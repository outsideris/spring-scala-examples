package kr.ne.outsider

import scala.beans.BeanProperty

/**
 * Copyright (c) 2013 JeongHoon Byun aka "Outsider", <http://blog.outsider.ne.kr/>
 * Licensed under the MIT license.
 * <http://outsider.mit-license.org/>
 *
 * Author: Outsider
 * Date: 13. 9. 29.
 * Time: 오후 7:22
 */
class Conference(val name:String) {
  @BeanProperty
  var when:String = _
  @BeanProperty
  var where:String = _
}
