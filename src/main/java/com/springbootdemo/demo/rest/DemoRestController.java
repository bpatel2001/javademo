package com.springbootdemo.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    // exposing "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/carcompanies")
    public String returnCarCompanies() {
        return "Honda, Toyota, BMW, Ford";
    }


}
