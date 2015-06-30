package javaconfig.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Method interceptor - before method invocation");
        Object retValue = invocation.proceed();
        System.out.println("Method interceptor - after method invocation");
        return retValue;
    }

}
