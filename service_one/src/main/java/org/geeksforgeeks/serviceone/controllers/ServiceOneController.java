package org.geeksforgeeks.serviceone.controllers;

import org.geeksforgeeks.serviceone.dao.ResponseDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    @GetMapping("/first_name")
    public ResponseEntity<ResponseDao> getFirstName() {
        return ResponseEntity.ok(new ResponseDao("Shantanu"));
    }

}
