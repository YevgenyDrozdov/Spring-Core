package javaconfig.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("javaconfig");
        String testString = context.getBean("testString", String.class);
        System.out.println(testString);

        Integer randomVal = context.getBean("randomInt", Integer.class);
        System.out.println("RandomInt 1: " + randomVal);

        randomVal = context.getBean("randomInt", Integer.class);
        System.out.println("RandomInt 2: " + randomVal);

        randomVal = context.getBean("randomInt", Integer.class);
        System.out.println("RandomInt 3: " + randomVal);
    }

}
