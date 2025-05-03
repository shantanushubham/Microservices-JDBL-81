package org.geeksforgeeks.servicetwo.service;

import org.geeksforgeeks.servicetwo.clients.ServiceOneClient;
import org.geeksforgeeks.servicetwo.dao.ServiceOneResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTwoService {

    private final ServiceOneClient serviceOneClient;

    @Autowired
    public ServiceTwoService(ServiceOneClient serviceOneClient) {
        this.serviceOneClient = serviceOneClient;
    }

    public ServiceOneResponse fetchFirstName() {
        return this.serviceOneClient.getFirstName();
    }
}
