package com.mycompany.myapp.web.rest.errors.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ms2")
public class MessageController {

    @PostMapping("/message")
    public ResponseEntity<String> receiveMessage(@RequestBody String message) {
        System.out.println("Message reçu de MS1 : " + message);
        return ResponseEntity.ok("Message reçu : " + message);
    }
}

