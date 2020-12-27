package com.codeman.springcloud.service;

import com.codeman.springcloud.entities.CommonResult;
import com.codeman.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/8 21:11
 * @version: 1.0
 */
//@FeignClient(name = "CLOUD-PAYMENT-SERVICE")
@FeignClient(name = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallBackServiceImpl.class)
public interface PaymentFeignService {

//    @GetMapping("/payment/get/{id}")
//    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

//    @PostMapping("/payment/create")
//    CommonResult<Payment> create(@RequestBody Payment payment);

    @GetMapping("/payment/discover")
    Object discover();

    @GetMapping("/payment/discoverAfter3Min")
    Object discoverAfter3Min();


    @GetMapping("/payment/paymentCircuitBreaker/{id}")
    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
