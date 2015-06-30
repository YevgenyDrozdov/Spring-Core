package javaconfig.methodinjection;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    public Singleton singleton() {
        return new SingletonImpl() {
            @Override
            public Prototype getPrototype() {
                return Config.this.prototype();
            }
        };
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Prototype prototype() {
        return new PrototypeImpl();
    }

}
