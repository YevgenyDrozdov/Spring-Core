package validation.ownvalidator;


public class Person {

    @CheckCase(value = CaseType.UPPER_CASE, message = "First name must be in upper case.")
    private String firstName;

    @CheckCase(value = CaseType.LOWER_CASE, message = "Last name must be in lower case.")
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
