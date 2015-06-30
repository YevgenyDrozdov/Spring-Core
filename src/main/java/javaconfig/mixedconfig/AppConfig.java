package javaconfig.mixedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(ServicesConfig.class)
@ImportResource("classpath:mixedconfig-context.xml")
public class AppConfig {

    @Autowired
    // Defined in separate java config
    private LogService logService;

    @Autowired
    // Defined in XML context
    private MailService mailService;

    @Bean
    public Application application() {
        return new ConsoleApplication(logService, mailService);
    }

}
