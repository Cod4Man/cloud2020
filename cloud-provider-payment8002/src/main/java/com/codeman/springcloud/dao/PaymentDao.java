package com.codeman.springcloud.dao;

import com.codeman.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/11/29 22:18
 * @version: 1.0
 */
@Mapper
public interface PaymentDao {

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
    Payment getPaymentById(@Param("id") Long id);
}
