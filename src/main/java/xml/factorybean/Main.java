package xml.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factorybean-context.xml");
        System.out.println(context.getBean("randomColor", Color.class));
        System.out.println(context.getBean("randomColor", Color.class));
        System.out.println(context.getBean("randomColor", Color.class));
        System.out.println(context.getBean("randomColor", Color.class));
        System.out.println(context.getBean("randomColor", Color.class));
    }

}
