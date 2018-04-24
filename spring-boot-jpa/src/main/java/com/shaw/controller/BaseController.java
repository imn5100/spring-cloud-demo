package com.shaw.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @GetMapping("/hello")
    public String handle() {
        //returns a String to be written to the response body.
        return "Hello WebFlux";
    }


}
