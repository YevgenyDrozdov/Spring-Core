package annotation.service;

import org.springframework.stereotype.Service;

@Service("2")
public class WelcomeService implements DeliveryService {

    @Override
    public void deliverDocument() {
        System.out.println("Welcome!");
    }

}
