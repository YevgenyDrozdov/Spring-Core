package javaconfig.eventpublisher;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}
