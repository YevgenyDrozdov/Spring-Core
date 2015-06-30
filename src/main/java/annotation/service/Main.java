package annotation.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("annotation.service");
        MainDeliveryService deliveryService = context.getBean(MainDeliveryService.class);
        deliveryService.deliver("1");
    }

}
