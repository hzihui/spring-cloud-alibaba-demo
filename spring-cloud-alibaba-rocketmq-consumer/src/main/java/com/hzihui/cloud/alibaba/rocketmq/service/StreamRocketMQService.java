package com.hzihui.cloud.alibaba.rocketmq.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

/**
 * @author HZI.HUI
 * @date 2019/8/11 15:05
 */
@Service
@Slf4j
public class StreamRocketMQService {

    /**
     * 接收普通消息
     * @param message
     */
    @StreamListener(Sink.INPUT)
    public void revice(String message){
        log.info("接收到普通的消息：{}",message);
    }
}
