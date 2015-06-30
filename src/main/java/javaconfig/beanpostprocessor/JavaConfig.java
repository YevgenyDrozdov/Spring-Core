package javaconfig.beanpostprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {

    @Bean
    public BeanPostProcessor myBPP() {
        return new MyBeanPostProcessor();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public MyBean myBean() {
        return new MyBeanImpl();
    }

    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }

}
