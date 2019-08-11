package com.hzihui.cloud.alibaba.provider.handler;

import com.hzihui.cloud.alibaba.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * @author HZI.HUI
 * @date 2019/8/7 21:38
 */
@Component
@RequiredArgsConstructor
public class ProductHanlder {

    private final ProductService productService;

    public Mono<ServerResponse> getProductById(ServerRequest serverRequest){
        Optional<String> name = serverRequest.queryParam("name");
        String resultDesc = this.productService.getProductByUserId(name.get());
        return ServerResponse.ok().body(Mono.just(resultDesc), String.class);
    }
}
