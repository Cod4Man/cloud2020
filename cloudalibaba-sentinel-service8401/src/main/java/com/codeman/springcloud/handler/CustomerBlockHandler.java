package com.codeman.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/1/13 23:08
 * @version: 1.0
 */
public class CustomerBlockHandler {

    public static String handler01(Long id, String name, BlockException exception) {
        return "handler01";
    }
    public static String handler02(Long id, String name, BlockException exception) {
        return "handler02";
    }
}
