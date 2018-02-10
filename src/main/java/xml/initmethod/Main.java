package xml.initmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("init-method-context.xml");
        //context.getBean(Human.class);

        //System.out.println(Integer.MAX_VALUE);
    }

}
