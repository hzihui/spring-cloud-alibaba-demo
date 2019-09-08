package com.hzihui.cloud.alibaba.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HZI.HUI
 * @date 2019/9/8 10:25
 */
@RestController
@RequestMapping("test")
@RefreshScope
public class TestController {

    @Value("${test.config}")
    private String testConfigStr;

    @GetMapping("testNacosConfig")
    public String testNacosConfig(){
        return testConfigStr;
    }
}
