package javaconfig.aspects;

public class LogService implements Service {

    @Override
    public void call(String parameters) {
        System.out.println("Calling log service with arguments: " + parameters);
    }

}
