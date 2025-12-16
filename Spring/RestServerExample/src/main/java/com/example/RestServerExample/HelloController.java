package com.example.RestServerExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String home() {
        return "¡Bienvenido a tu REST API!";
    }
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
    @GetMapping("/mondongo")
    public String mondongo() {
        return "Mondongo!";
    }
}