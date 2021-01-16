package com.codeman.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.codeman.springcloud.handler.CustomerBlockHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/1/12 22:28
 * @version: 1.0
 */
@Controller
@Slf4j
public class SentinelController {

    @GetMapping("/sentinel01")
    @ResponseBody
    public String test01() {
        log.info("into test01");
        return "test01";
    }

    @GetMapping("/sentinel02")
    @ResponseBody
    public String test02() {
        log.info("into test02");
        return "test02";
    }

    @GetMapping("/sentinel03")
    public String test03() {
        log.info("into test03");
        return "/sentinel01";
    }

    @GetMapping("/sentinel04")
    public String test04() {
        int i = 1 / 0;
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        log.info("into test04");
        return "test04";
    }

    @GetMapping("/sentinel05/{id}/{name}")
    @ResponseBody
    @SentinelResource(value = "sentinel05", blockHandler = "handle_test05")
    public String test05(@PathVariable("id") Long id, @PathVariable("name") String name) {
        log.info("into test05");

        return "test05-" + id + "-" + name ;
    }

    public String handle_test05(Long id, String name, BlockException exception) {
        return "handle test05";
    }

    @GetMapping("/sentinel06/{id}/{name}")
    @ResponseBody
    @SentinelResource(value = "sentinel06", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handler01")
    public String test06(@PathVariable("id") Long id, @PathVariable("name") String name) {
        log.info("into test06");

        return "test06-" + id + "-" + name ;
    }
}