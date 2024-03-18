package com.labs.sboot.ci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping
    public String greetings() {
        return "Welcome to GitHub Actions CI Demo!!!";
    }
}
