package com.Catapulter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class ApiController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/message")
    public String getMessage() {
        return "Hello from the backend!";
    }
}
