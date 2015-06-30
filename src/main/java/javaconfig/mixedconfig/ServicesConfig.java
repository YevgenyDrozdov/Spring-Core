package javaconfig.mixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Bean
    public LogService logService() {
        return new RemoteLogService();
    }

}
