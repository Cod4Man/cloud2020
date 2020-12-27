package com.codeman.springcloud.controller;

import com.codeman.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/27 22:55
 * @version: 1.0
 */
@RestController
public class MsgProController {

    @Resource
    private IMessageProvider messageProvider;


    @GetMapping("/send")
    public String send() {
        return messageProvider.send();
    }
}
