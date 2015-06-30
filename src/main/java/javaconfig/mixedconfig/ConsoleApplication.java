package javaconfig.mixedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PostConstruct;

public class ConsoleApplication implements Application {

    private LogService logService;
    private MailService mailService;

    public ConsoleApplication(LogService logService, MailService mailService) {
        this.logService = logService;
        this.mailService = mailService;
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Override
    @PostConstruct
    public void run() {
        System.out.println("Testing debug message.");
        logService.debug("This is a test debug message.");

        System.out.println("Testing error message.");
        logService.error("This is a test error message");

        System.out.println("Testing mail service.");
        mailService.sendMail("Test email");
    }

}
