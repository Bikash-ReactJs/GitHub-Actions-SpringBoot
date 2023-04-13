package com.bikash.actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello World! Testing GitHub Actions.";
    }
}
