package javaconfig.aspects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private Service logService;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Main main = context.getBean(Main.class);
        //main.run();


        UserService userService = context.getBean(UserService.class);
        userService.createUser("Mike");
    }

    private void run() {
        getLogService().call("Test log record");
    }

    public void setLogService(Service logService) {
        this.logService = logService;
    }

    public Service getLogService() {
        return logService;
    }
}
