package com.codeman.springcloud.servicce.impl;

import com.codeman.springcloud.dao.PaymentDao;
import com.codeman.springcloud.entities.Payment;
import com.codeman.springcloud.servicce.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/11/29 22:38
 * @version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
