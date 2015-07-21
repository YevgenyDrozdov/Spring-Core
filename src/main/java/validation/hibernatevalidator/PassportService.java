package validation.hibernatevalidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class PassportService {

    @Valid
    @Autowired
    private Passport passport;

}
