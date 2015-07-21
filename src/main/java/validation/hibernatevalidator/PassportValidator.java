package validation.hibernatevalidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Component
public class PassportValidator {

    @Autowired
    private Validator validator;

    public void printAllErrorMessages(Passport passport) {
        Set<ConstraintViolation<Passport>> violations = validator.validate(passport);

        for (ConstraintViolation<Passport> violation : violations) {
            System.out.println(violation.getMessage());
        }

    }

    public void printAllErrorMessages(PassportService passportService) {
        Set<ConstraintViolation<PassportService>> violations = validator.validate(passportService);

        for (ConstraintViolation<PassportService> violation : violations) {
            System.out.println(violation.getMessage());
        }

    }

}
