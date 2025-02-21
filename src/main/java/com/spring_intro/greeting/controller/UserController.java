package com.spring_intro.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation marks the class as a REST controller, meaning it will handle HTTP requests
@RestController
public class UserController {

    // Handles GET requests for the "/hello" endpoint
    @GetMapping("/hello")
    public String sayHello() {
        // Returns a simple greeting message as the HTTP response
        return "Hello From BridgeLabz";
    }
}
