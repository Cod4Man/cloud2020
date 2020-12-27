package com.codeman.spirngcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/6 15:33
 * @version: 1.0
 */
@RestController
public class OrderController {

    private static final String INVOKE_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/serviceInfo")
    public String serviceInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/serviceInfo", String.class);
    }
}
