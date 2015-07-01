package rmi.server;

import rmi.common.Greeter;

public class HelloGreeter implements Greeter {

    @Override
    public String greeting() {
        return "Hello!";
    }

}
