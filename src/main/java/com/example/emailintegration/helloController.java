package com.example.emailintegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class helloController {
    @GetMapping("/")
    public String heiio(){
        return "hello it's email integration";
    }
}
