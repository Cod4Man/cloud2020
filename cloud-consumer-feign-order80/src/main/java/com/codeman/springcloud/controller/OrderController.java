package com.codeman.springcloud.controller;

import com.codeman.springcloud.entities.CommonResult;
import com.codeman.springcloud.entities.Payment;
import com.codeman.springcloud.service.PaymentFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/8 21:10
 * @version: 1.0
 */
@RestController
@DefaultProperties(defaultFallback = "defaultFallBackMethod")
public class OrderController {

    @Resource
    private PaymentFeignService paymentFeignService;

//    @GetMapping("/consumer/payment/create")
//    public CommonResult<Payment> create(Payment payment) {
//        return paymentFeignService.create(payment);
//    }
//
//    @GetMapping("/consumer/payment/get/{id}")
//    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return paymentFeignService.getPaymentById(id);
//    }

    @GetMapping("/consumer/payment/discoverAfter3Min")
    /*@HystrixCommand(fallbackMethod = "discoverAfter3MinFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")
    })*/
    @HystrixCommand
    public Object discoverAfter3Min() {
        return paymentFeignService.discoverAfter3Min();
    }

    @GetMapping("/consumer/payment/discover")
    Object discover() {
        return paymentFeignService.discover();
    }


    public Object discoverAfter3MinFallback() {
        return "客户端fallback";
    }

    public Object defaultFallBackMethod() {
        return "客户端DefaultFallBack";
    }


    @GetMapping("/consumer/payment/paymentCircuitBreaker/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        return paymentFeignService.paymentCircuitBreaker(id);
    }
}
