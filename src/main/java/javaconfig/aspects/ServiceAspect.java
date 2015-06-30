package javaconfig.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Pointcut("execution(void javaconfig.aspects.Service.call(..))")
    public void serviceCallMethod() {}


    @Before("execution(void javaconfig.aspects.Service.call(..))")
    public void beforeCall() {
        System.out.println("Before service call!");
    }

    @After("serviceCallMethod()")
    public void afterCall(JoinPoint jp) {
        String name = jp.getSignature().toLongString();
        System.out.println("After service call! Called: " + name);
    }

}
