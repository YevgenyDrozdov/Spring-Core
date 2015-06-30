package xml.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        ApplicationContext context = main.getJavaConfiguration();

        Book book1 = context.getBean("bookPrototype", Book.class);
        Book book2 = context.getBean("bookPrototype", Book.class);

        System.out.println("Is the same book? " + (book1 == book2));


    }

    private ApplicationContext getXmlConfiguration() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scope-context.xml");
        return context;
    }

    private ApplicationContext getJavaConfiguration() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        return context;
    }

}
