package xml.definitioninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("definitioninheritance-context.xml");
        LoggingService loggingService = (LoggingService)context.getBean("loggingService");
        loggingService.execute();
    }

}
