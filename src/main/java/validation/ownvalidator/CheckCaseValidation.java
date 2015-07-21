package validation.ownvalidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckCaseValidation implements ConstraintValidator<CheckCase, String> {

    private CaseType caseType;

    @Override
    public void initialize(CheckCase constraintAnnotation) {
        caseType = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {


        if (caseType == CaseType.UPPER_CASE) {
            return value.equals(value.toUpperCase());
        } else {
            return value.equals(value.toLowerCase());
        }
    }

}
