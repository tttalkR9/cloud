package com.example.nacosclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class NacosClientController {

    @Autowired
    private ProviderFeign providerFeign;

    @GetMapping("/test")
    public String test() {
        return providerFeign.invoke();

    }


}


@FeignClient("nacos-provider")
interface ProviderFeign {

    @GetMapping("invoke")
    String invoke();

}


