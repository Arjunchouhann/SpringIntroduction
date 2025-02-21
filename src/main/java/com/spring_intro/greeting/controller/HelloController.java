package com.spring_intro.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Controller Class
@Controller
public class HelloController {

    @GetMapping("/greet")
    public String sayHello() {
        return "Hello From BridgeLabz"; //return Hello message
    }

    @GetMapping("/greet/message")
    public String message(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "index"; // returns index.html
    }
}
