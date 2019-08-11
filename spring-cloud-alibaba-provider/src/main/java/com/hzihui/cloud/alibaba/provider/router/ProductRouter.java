package com.hzihui.cloud.alibaba.provider.router;

import com.hzihui.cloud.alibaba.provider.handler.ProductHanlder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author HZI.HUI
 * @date 2019/8/7 21:37
 */
@Configuration
public class ProductRouter {


    @Bean
    public RouterFunction<ServerResponse> responseRouterFunction(ProductHanlder productHanlder){
        return RouterFunctions
                .route(RequestPredicates.GET("/getProductById"),
                        productHanlder::getProductById);
    }
}
