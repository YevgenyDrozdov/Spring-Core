package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MainDeliveryServiceImpl implements MainDeliveryService {

    @Autowired
    private Map<String, DeliveryService> services;

    @Override
    public void deliver(String serviceName) {
        services.get(serviceName).deliverDocument();
    }

}
