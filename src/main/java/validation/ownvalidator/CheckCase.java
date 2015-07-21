package validation.ownvalidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckCaseValidation.class)
public @interface CheckCase {

    CaseType value();
    String message();

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
