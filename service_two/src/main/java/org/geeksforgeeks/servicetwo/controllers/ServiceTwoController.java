package org.geeksforgeeks.servicetwo.controllers;

import org.geeksforgeeks.servicetwo.dao.NodePrefixResponse;
import org.geeksforgeeks.servicetwo.dao.ResponseDao;
import org.geeksforgeeks.servicetwo.dao.ServiceOneResponse;
import org.geeksforgeeks.servicetwo.service.ServiceTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceTwoController {

    private final ServiceTwoService service;

    public ServiceTwoController(ServiceTwoService service) {
        this.service = service;
    }

    @GetMapping("/full_name")
    public ResponseEntity<?> getFullName() {
//        RestTemplate rt = new RestTemplate();
//        ServiceOneResponse r1 = rt.getForObject(
//                "http://localhost:7070/first_name",
//                        ServiceOneResponse.class);
//        System.out.println(r1.getFirstName());
        ServiceOneResponse r1 = this.service.fetchFirstName();
        NodePrefixResponse r2 = this.service.fetchPrefix();
        return ResponseEntity.ok(new ResponseDao(r2.getPrefix() + " " + r1.getFirstName() + " Shubham"));
    }

}

