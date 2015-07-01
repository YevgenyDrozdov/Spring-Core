package javaconfig.applicationlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public ApplicationListener contextRefreshListener() {
        return new PostInitializationApplicationListener();
    }

    @Bean
    public MyBean myBean() {
        return new MyBeanImpl();
    }

}
