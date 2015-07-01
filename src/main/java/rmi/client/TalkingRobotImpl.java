package rmi.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rmi.common.Greeter;

import javax.annotation.PostConstruct;

@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Autowired
    private Greeter greeter;

    @PostConstruct
    public void talk() {
        System.out.println(greeter.greeting());
    }

}
