package javaconfig.beanpostprocessor;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class MyAspect {

    @Before("execution(void javaconfig.beanpostprocessor.MyBean.run())")
    public void beforeRun() {
        System.out.println("Aspect: before run");
    }

}
