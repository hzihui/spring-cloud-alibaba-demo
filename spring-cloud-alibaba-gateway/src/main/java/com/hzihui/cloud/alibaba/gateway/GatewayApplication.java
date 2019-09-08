package com.hzihui.cloud.alibaba.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HZI.HUI
 * @date 2019/9/7 10:42
 */
@SpringBootApplication(scanBasePackages = "com.hzihui.cloud.alibaba")
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
    }
}
