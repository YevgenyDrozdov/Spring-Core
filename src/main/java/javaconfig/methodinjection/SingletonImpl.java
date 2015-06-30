package javaconfig.methodinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class SingletonImpl implements Singleton {

    @Autowired
    private Prototype prototype;

    @Override
    public Prototype getPrototype() {
        return prototype;
    }
}
