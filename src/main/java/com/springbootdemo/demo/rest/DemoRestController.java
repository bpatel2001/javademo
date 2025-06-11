package com.springbootdemo.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    // Injecting a default company name from our application.properties
    @Value("${company.name}")
    private String companyName;

    // Exposing "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/carcompanies")
    public String returnCarCompanies() {
        return companyName + ", Toyota, BMW, Ford";
    }
}
