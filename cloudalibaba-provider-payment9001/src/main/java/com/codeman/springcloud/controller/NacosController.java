package com.codeman.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/1/3 21:26
 * @version: 1.0
 */
@RestController
public class NacosController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/test")
    public String nacosTest() {
        return "Nacos server.port =" + serverPort;
    }
}
