package com.shaw.cloudtest.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${myconfig.name}")
    private String myconfig;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return myconfig;
    }
}
