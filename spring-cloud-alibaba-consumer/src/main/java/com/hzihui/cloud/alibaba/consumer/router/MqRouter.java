package com.hzihui.cloud.alibaba.consumer.router;

import com.hzihui.cloud.alibaba.consumer.handler.MqHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author HZI.HUI
 * @date 2019/8/11 15:09
 */
@Configuration
public class MqRouter {

    @Bean
    public RouterFunction<ServerResponse> responseMqRouter(MqHandler mqHandler){
        return RouterFunctions.route(RequestPredicates.GET("/sendMessage/{content}"),
                mqHandler::sendMessage);
    }
}
