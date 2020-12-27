package com.codeman.springcloud.controller;

import com.codeman.springcloud.component.ValueComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/26 13:54
 * @version: 1.0
 */
@RestController
@Slf4j
public class ConfigInfoController {

    @Resource
    private ValueComponent valueComponent;

    @GetMapping("/applicationName")
    private String getApplicationName() {
        log.info("into getAppllicatioName " + valueComponent.getApplicationName());
        return valueComponent.getApplicationName();
    }


}
