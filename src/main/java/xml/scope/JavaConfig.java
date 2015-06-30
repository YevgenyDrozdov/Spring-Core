package xml.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean
    @Scope("prototype")
    public Book bookPrototype() {
        return new BookPrototype();
    }

    @Bean
    @Scope("singleton")
    public Book bookSingleton() {
        return new BookSingleton();
    }


}
