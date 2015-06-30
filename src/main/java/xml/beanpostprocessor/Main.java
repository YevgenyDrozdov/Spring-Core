package xml.beanpostprocessor;

import xml.initmethod.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanpostprocessor-context.xml");
        Human baby = (Human)context.getBean("beanpostprocessor.Baby");
        baby.born();
    }

}
