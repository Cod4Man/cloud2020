package com.codeman.springcloud.controller;

import com.codeman.springcloud.config.CommonComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/1/4 23:55
 * @version: 1.0
 */
@RestController
public class NacosConfigController {

    @Resource
    private CommonComponent commonComponent;

    @GetMapping("/nacos/configInfo")
    public String getConfigInfo() {
        return "dangdangdang_  _ " + commonComponent.getConfigInfo();
    }
}
