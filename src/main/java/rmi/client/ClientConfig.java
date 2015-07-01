package rmi.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import rmi.common.Greeter;

@Configuration
public class ClientConfig {

    @Bean
    public Greeter greeter() {
        RmiProxyFactoryBean proxyFactoryBean = new RmiProxyFactoryBean();
        proxyFactoryBean.setServiceUrl("rmi://localhost:1099/Greeter123");
        proxyFactoryBean.setServiceInterface(Greeter.class);
        proxyFactoryBean.afterPropertiesSet();
        return (Greeter) proxyFactoryBean.getObject();
    }

}
