package com.Catapulter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Return the name of the HTML template or view
    }
}

