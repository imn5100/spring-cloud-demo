package com.shaw.remoteInterface;


import com.shaw.remoteInterface.hystrix.HelloInterfaceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer", fallback = HelloInterfaceHystrix.class)
public interface HelloInterface {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/goAway")
    String goAway(@RequestParam(value = "name") String name);
}
