package kr.ne.outsider;

import org.springframework.stereotype.Repository;

/**
 * Copyright (c) 2013 JeongHoon Byun aka "Outsider", <http://blog.outsider.ne.kr/>
 * Licensed under the MIT license.
 * <http://outsider.mit-license.org/>
 * <p/>
 * Author: Outsider
 * Date: 13. 9. 29.
 * Time: 오후 5:01
 */
@Repository
public class Conference {
    private String name;
    private String when;
    private String where;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }
}
