package com.example.nacosclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//实现服务注册
@EnableDiscoveryClient
//使用feign客户端
@EnableFeignClients
public class NacosclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosclientApplication.class, args);
    }

}
