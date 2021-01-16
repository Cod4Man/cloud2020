package com.codeman.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/1/3 22:23
 * @version: 1.0
 */
@RestController
public class NacosOrderController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String baseUrl;

    @GetMapping("/consumer/nacos/test")
    public String nacosTest() {
        return restTemplate.getForObject(baseUrl + "/payment/nacos/test", String.class);
    }
}
