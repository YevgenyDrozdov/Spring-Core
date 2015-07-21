package javaconfig.eventpublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean {

    @Autowired
    private ApplicationEventPublisher publisher;

    @PostConstruct
    public void init() {
        publisher.publishEvent(new MyEvent("000"));
    }


}
