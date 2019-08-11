package com.hzihui.cloud.alibaba.consumer.router;

import com.hzihui.cloud.alibaba.consumer.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author HZI.HUI
 * @date 2019/8/7 22:10
 */
@Configuration
public class UserRouter {

    @Bean
    public RouterFunction<ServerResponse> responseRouterFunction(UserHandler userHandler){
        return RouterFunctions
                .route(RequestPredicates.GET("/feign/{id}"),
                        userHandler::getByUserId)
                .andRoute(RequestPredicates.GET("/dubbo/{id}"),
                        userHandler::dubboUserInfo);
    }
}
