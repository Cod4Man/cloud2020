package com.codeman.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/15 23:25
 * @version: 1.0
 */
@Component
public class PaymentFallBackServiceImpl implements PaymentFeignService {
    @Override
    public String discover() {
        return "PaymentFallBackServiceImpl - 服务降低调用 discover";
    }

    @Override
    public String discoverAfter3Min() {
        return "PaymentFallBackServiceImpl - 服务降低调用 discoverAfter3Min";
    }

    @Override
    public String paymentCircuitBreaker(Integer id) {
        return "PaymentFallBackServiceImpl - 服务降低调用  paymentCircuitBreaker";
    }
}
