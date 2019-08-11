package com.hzihui.cloud.alibaba.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author HZI.HUI
 * @date 2019/8/7 21:24
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.hzihui.cloud.alibaba"})
public class ProviderAplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderAplication.class);
    }
}
