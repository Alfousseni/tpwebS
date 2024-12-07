package com.mycompany.myapp.web.rest.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/ms1")
public class MessageController {

    private final RestTemplate restTemplate;

    public MessageController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @PostMapping("/message")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        String response = restTemplate.postForObject("http://api/ms2/messages", message, String.class);
        return ResponseEntity.ok("Message envoyé à MS2 : " + response);
    }
}
