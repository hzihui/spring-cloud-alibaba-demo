package com.hzihui.cloud.alibaba.consumer.configuration;

import ribbonConfiguration.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Configuration;

/**
 * Ribbon负载均衡
 * @author HZI.HUI
 * @date 2019/7/17 22:34
 */
@Configuration
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class UserCenterRibbonConfiguration {
}
