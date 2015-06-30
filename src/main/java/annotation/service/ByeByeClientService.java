package annotation.service;

import org.springframework.stereotype.Service;

@Service("1")
public class ByeByeClientService implements DeliveryService {

    @Override
    public void deliverDocument() {
        System.out.println("Bye-bye!");
    }

}
