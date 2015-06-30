package javaconfig.methodinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Singleton singleton = context.getBean(Singleton.class);
        System.out.println(singleton.getPrototype().timestamp());
        System.out.println(singleton.getPrototype().timestamp());
        System.out.println(singleton.getPrototype().timestamp());
    }

}
