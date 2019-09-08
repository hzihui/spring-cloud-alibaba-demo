package com.hzihui.cloud.alibaba.consumer.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author HZI.HUI
 * @date 2019/8/11 15:10
 */
@RestController
@RequiredArgsConstructor
public class MqHandler {

    private final Source source;
    /**
     * 消息提供者
     * @param serverRequest
     * @return
     */
    public Mono<ServerResponse> sendMessage(ServerRequest serverRequest){
        String content = serverRequest.pathVariable("content");
        this.source.output()
                .send(
                        MessageBuilder.withPayload(content).build()
                );
        return ServerResponse.ok()
                .body(Mono.just(true),Boolean.class);
    }
}
