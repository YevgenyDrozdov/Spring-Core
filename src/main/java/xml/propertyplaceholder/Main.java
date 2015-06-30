package xml.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("properyplaceholder-context.xml");
        String str = context.getBean("myString", String.class);
        System.out.println(str);
    }

}
