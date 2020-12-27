package com.codeman.springcloud.controller;

import com.codeman.springcloud.entities.CommonResult;
import com.codeman.springcloud.entities.Payment;
import com.codeman.springcloud.servicce.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/11/29 22:39
 * @version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("进入方法PaymentController.create.result=" + result);

        return result > 0
                ? new CommonResult(200, "插入成功, serverPort： " + serverPort, result)
                : new CommonResult(444, "插入失败", null);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("进入方法PaymentController.getPaymentById.result=" + payment);

        return payment != null
                ? new CommonResult(200, "查询成功， serverPort=" + serverPort, payment)
                : new CommonResult(444, "查询失败", null);
    }

    @GetMapping("/payment/discover")
    public Object discover() {
        log.info("into discover, serverPort=" + serverPort);
        List<String> services = discoveryClient.getServices();

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

        return new Object[]{services, instances};
    }

    @GetMapping("/payment/discoverAfter3Min")
    public Object discoverAfter3Min() {
        log.info("into discoverAfter3Min, serverPort=" + serverPort);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> services = discoveryClient.getServices();

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

        return new Object[]{services, instances};
    }

}
