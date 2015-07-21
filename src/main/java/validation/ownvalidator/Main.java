package validation.ownvalidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Component("main")
public class Main {

    @Autowired
    private Person person;

    @Autowired
    private Validator validator;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("validation.ownvalidator");
        Main main = (Main) context.getBean("main");
        main.printAllErrors(main.person);
    }

    private void printAllErrors(Person person) {
        Set<ConstraintViolation<Person>> violations = validator.validate(person);
        for (ConstraintViolation<Person> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }

}
