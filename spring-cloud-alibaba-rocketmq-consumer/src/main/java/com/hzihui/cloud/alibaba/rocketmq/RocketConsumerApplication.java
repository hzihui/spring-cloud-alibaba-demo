package com.hzihui.cloud.alibaba.rocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author HZI.HUI
 * @date 2019/8/11 14:59
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.hzihui.cloud.alibaba")
@EnableFeignClients(basePackages = "com.hzihui.cloud.alibaba")
@EnableBinding(Sink.class)
public class RocketConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketConsumerApplication.class,args);
    }
}
