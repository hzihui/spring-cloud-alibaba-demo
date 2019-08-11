package com.hzihui.cloud.alibaba.consumer.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;


/**
 * 全局feign日志打印配置
 * @author HZI.HUI
 * @date 2019/7/21 14:32
 */
public class GlobalFeignClientConfiguration {

    @Bean
    public Logger.Level level(){
        return Logger.Level.FULL;
    }
}
