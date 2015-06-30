package javaconfig.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("javaconfig.aspects")
public class JavaConfig {

    @Bean
    public Main main() {
        Main main = new Main();
        main.setLogService(logService());
        return main;
    }

    @Bean
    public Service logService() {
        return new LogService();
    }

    @Bean
    public BeanNameAutoProxyCreator methodInterceptorAspect() {
        BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
        beanNameAutoProxyCreator.setBeanNames("*Service");
        beanNameAutoProxyCreator.setInterceptorNames("methodInterceptor");
        return beanNameAutoProxyCreator;
    }

    @Bean
    public MethodInterceptor methodInterceptor() {
        return new MyMethodInterceptor();
    }

    @Bean
    public UserService userService() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setDatabaseService(databaseService());
        return userService;
    }

    @Bean
    public DatabaseService databaseService() {
        return new DatabaseServiceImpl();
    }

    @Bean
    public TransactionAspect transactionAspect() {
        return new TransactionAspect();
    }

}
