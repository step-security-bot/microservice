package com.autmaple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(Principal principal) {
//        return "Hello AutMaple";
        return principal.getName();
    }
}
