package javaconfig.mixedconfig;

public class RemoteLogService implements LogService {

    @Override
    public void debug(String message) {
        System.out.println("Writing debug log message remotely: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("Writing error log message remotely: " + message);
    }
}
