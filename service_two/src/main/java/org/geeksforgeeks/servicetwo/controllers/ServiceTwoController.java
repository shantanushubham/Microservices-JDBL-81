package org.geeksforgeeks.servicetwo.controllers;

import org.geeksforgeeks.servicetwo.dao.ResponseDao;
import org.geeksforgeeks.servicetwo.dao.ServiceOneResponse;
import org.geeksforgeeks.servicetwo.service.ServiceTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {

    private final ServiceTwoService service;

    @Autowired
    public ServiceTwoController(ServiceTwoService service) {
        this.service = service;
    }

    @GetMapping("/last_name")
    public ResponseEntity<ResponseDao> getLastName() {
//        RestTemplate rt = new RestTemplate();
//        ServiceOneResponse r1 = rt.postForEntity(
//                "http://localhost:7070/first_name",
//                        null,
//                        ServiceOneResponse.class)
//                .getBody();
//        System.out.println(r1.getFirstName());
        ServiceOneResponse r1 = this.service.fetchFirstName();
        return ResponseEntity.ok(new ResponseDao(r1.getFirstName() + " Shubham"));
    }

}

