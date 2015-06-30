package javaconfig.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Random;

@Configuration
@PropertySource("classpath:propertyplaceholder.properties")
public class Config {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public String testString(@Value("${string.value}") String value) {
        return new String(value);
    }

    @Bean
    @Scope("${int.scope}")
    public Integer randomInt() {
        Random random = new Random();
        return new Integer(random.nextInt());
    }

}
