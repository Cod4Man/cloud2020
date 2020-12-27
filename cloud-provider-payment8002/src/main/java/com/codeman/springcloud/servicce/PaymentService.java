package com.codeman.springcloud.servicce;

import com.codeman.springcloud.entities.Payment;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/11/29 22:36
 * @version: 1.0
 */
public interface PaymentService {
    /**
     * 增
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 通过主键id查询Payment
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
