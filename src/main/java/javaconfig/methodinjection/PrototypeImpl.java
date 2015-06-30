package javaconfig.methodinjection;

import javax.annotation.PostConstruct;

public class PrototypeImpl implements Prototype {

    private long timestamp;

    @PostConstruct
    private void init() {
        timestamp = System.nanoTime();
    }

    @Override
    public long timestamp() {
        return timestamp;
    }

}
