package com.hzihui.cloud.alibaba.consumer.handler;

import com.hzihui.cloud.alibaba.consumer.service.DubboUserServiceImpl;
import com.hzihui.cloud.alibaba.consumer.service.UserServiceImpl;
import com.hzihui.cloud.alibaba.service.UserService;
import com.hzihui.cloud.alibaba.vo.UserVO;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @author HZI.HUI
 * @date 2019/8/7 22:01
 */
@RestController
public class UserHandler {

    @Resource(name = "userService")
    private UserService userService;

    @Resource(name = "dubboUserService")
    private UserService dubboUserService;

    /**
     * 使用 openfeign 调用 {@link UserServiceImpl}
     * @param serverRequest
     * @return
     */
    public Mono<ServerResponse> getByUserId(ServerRequest serverRequest){
        UserVO userVo = this.userService.getUserAndProductsByUserId(
                serverRequest.pathVariable("id"));
        return ServerResponse.ok()
                .body(Mono.just(userVo), UserVO.class);
    }

    /**
     * 使用dubbo调用 {@link DubboUserServiceImpl}
     * @param serverRequest
     * @return
     */
    public Mono<ServerResponse> dubboUserInfo(ServerRequest serverRequest){
        UserVO userVo = this.dubboUserService.getUserAndProductsByUserId(
                serverRequest.pathVariable("id"));
        return ServerResponse.ok()
                .body(Mono.just(userVo), UserVO.class);
    }

}
