package org.geeksforgeeks.servicetwo.service;

import org.geeksforgeeks.servicetwo.clients.NodeClient;
import org.geeksforgeeks.servicetwo.clients.ServiceOneClient;
import org.geeksforgeeks.servicetwo.dao.NodePrefixResponse;
import org.geeksforgeeks.servicetwo.dao.ServiceOneResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTwoService {

    private final ServiceOneClient serviceOneClient;
    private final NodeClient nodeClient;

    public ServiceTwoService(ServiceOneClient serviceOneClient, NodeClient nodeClient) {
        this.serviceOneClient = serviceOneClient;
        this.nodeClient = nodeClient;
    }

    public ServiceOneResponse fetchFirstName() {
        return this.serviceOneClient.getFirstName();
    }

    public NodePrefixResponse fetchPrefix() {
        return this.nodeClient.getPrefix();
    }
}
