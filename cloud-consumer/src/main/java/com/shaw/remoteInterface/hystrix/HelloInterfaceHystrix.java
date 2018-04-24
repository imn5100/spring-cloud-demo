package com.shaw.remoteInterface.hystrix;

import com.shaw.remoteInterface.HelloInterface;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloInterfaceHystrix implements HelloInterface {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello fail " + name;
    }

    @Override
    public String goAway(@RequestParam(value = "name") String name) {
        return "go away fail " + name;
    }
}
