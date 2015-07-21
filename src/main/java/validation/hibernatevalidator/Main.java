package validation.hibernatevalidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("main")
public final class Main {

    @Autowired
    private Passport passport;

    @Autowired
    private PassportValidator passportValidator;

    @Autowired
    private PassportService passportService;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("validation.hibernatevalidator");
        Main main = (Main) context.getBean("main");
        main.validatePassport();
    }

    public void validatePassport() {
        System.out.println(passport.toString());

        // Validate passport
        passportValidator.printAllErrorMessages(passport);

        // Validate passport service that holds the passport.
        // Must validate containing passport as well
        passportValidator.printAllErrorMessages(passportService);
    }

}
