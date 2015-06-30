package javaconfig.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyBean myBean = context.getBean(MyBean.class);
        myBean.run();
    }

}
