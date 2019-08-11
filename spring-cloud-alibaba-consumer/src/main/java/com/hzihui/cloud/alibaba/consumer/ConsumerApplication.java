package com.hzihui.cloud.alibaba.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author HZI.HUI
 * @date 2019/8/7 21:58
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.hzihui.cloud.alibaba")
//@EnableFeignClients(basePackages = "com.hzihui.cloud.alibaba",defaultConfiguration = GlobalFeignClientConfiguration.class)
@EnableFeignClients(basePackages = "com.hzihui.cloud.alibaba")
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
}
