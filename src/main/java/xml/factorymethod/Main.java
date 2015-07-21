package xml.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factorymethod-context.xml");
        Baby baby = (Baby)context.getBean("alice");
        System.out.println(baby);
    }

}
