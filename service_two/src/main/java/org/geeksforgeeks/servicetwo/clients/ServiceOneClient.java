package org.geeksforgeeks.servicetwo.clients;

import org.geeksforgeeks.servicetwo.dao.ServiceOneResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-one", url = "http://localhost:7070")
public interface ServiceOneClient {

    @GetMapping("/first_name")
    ServiceOneResponse getFirstName();

}
