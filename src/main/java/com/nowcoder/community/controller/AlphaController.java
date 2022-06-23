package com.nowcoder.community.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alpha")
public class AlphaController {

    @GetMapping ("/hello")
    public String sayHello(){
        System.out.println("Hello Spring Boot.");
        return "Hello Spring Boot.";
    }
}
