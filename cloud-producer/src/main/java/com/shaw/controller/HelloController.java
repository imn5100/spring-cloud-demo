package com.shaw.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello World " + name;
    }

    @RequestMapping("/goAway")
    public String goAway(@RequestParam String name) {
        return "goAway " + name;
    }

}
