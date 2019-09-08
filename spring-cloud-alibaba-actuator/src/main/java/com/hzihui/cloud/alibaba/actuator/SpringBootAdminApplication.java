package com.hzihui.cloud.alibaba.actuator;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HZI.HUI
 * @date 2019/9/8 16:05
 */
@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class,args);
    }
}
