package javaconfig.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TransactionAspect {

    @Pointcut("@annotation(javaconfig.aspects.Transactional)")
    private void transactionalMethods() {}

    @Pointcut("transactionalMethods() && args(user,..)")
    private void transactionalMethodsWithUserParameter(User user) {}

    @Around("transactionalMethods()")
    public void transactionalMethod(ProceedingJoinPoint pjp) {

        System.out.println("Transaction begins..");

        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("Transaction rolls back...");
            return;
        }

        System.out.println("Transaction ends..");
    }

    @Before("transactionalMethodsWithUserParameter(user)")
    public void userInTransaction(User user) {
        System.out.println("Transactional method received the user. User's name: " + user.getName());
    }

}
