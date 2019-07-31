package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
