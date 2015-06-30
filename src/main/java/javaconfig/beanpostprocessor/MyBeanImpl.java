package javaconfig.beanpostprocessor;

import javax.annotation.PostConstruct;

public class MyBeanImpl implements MyBean {

    @Override
    public void init() {
        System.out.println("MyBean: init");
    }

    @Override
    public void run() {
        System.out.println("MyBean: run");
    }

    @Override
    public void destroy() {
        System.out.println("MyBean: destroy");
    }

}
