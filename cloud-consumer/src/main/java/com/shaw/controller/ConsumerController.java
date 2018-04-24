package com.shaw.controller;

import com.shaw.remoteInterface.HelloInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private HelloInterface helloInterface;

    @RequestMapping("/hello/{name}")
    public String testRemote(@PathVariable("name") String name) {
        System.out.println(helloInterface.goAway(name));
        System.out.println(helloInterface.hello(name));
        return "Success";
    }

}
