package com.codeman.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/6 15:27
 * @version: 1.0
 */
@RestController
public class PaymentController {

    @GetMapping("/payment/serviceInfo")
    public String serviceInfo() {
        return UUID.randomUUID().toString();
    }
}
