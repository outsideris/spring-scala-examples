package kr.ne.outsider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    @Autowired
    private Conference conference;

    public String showSpringCamp() {
        conference.setName("SpringCamp");
        conference.setWhen("2013-10-13");
        conference.setWhere("코엑스");
        return conference.getName() + "\n" + conference.getWhen() + " / " + conference.getWhere();
    }
}
