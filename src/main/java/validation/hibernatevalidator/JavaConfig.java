package validation.hibernatevalidator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import java.util.Calendar;

@Configuration
public class JavaConfig {

    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean() {
        return new LocalValidatorFactoryBean();
    }

    @Bean
    public Passport passport() {
        Passport passport = new Passport();
        passport.setSeries("KB");
        passport.setNumber(1024785632L);

        Calendar acquireDate = Calendar.getInstance();
        acquireDate.set(2010, Calendar.MAY, 10);
        passport.setAcquireDate(acquireDate.getTime());

        Calendar validDate = Calendar.getInstance();
        validDate.set(2030, Calendar.MAY, 10);
        passport.setValidTo(validDate.getTime());

        return passport;
    }

}
