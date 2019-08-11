package com.hzihui.cloud.alibaba.service;

import com.alibaba.cloud.dubbo.annotation.DubboTransported;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author HZI.HUI
 * @date 2019/8/7 21:27
 */
 @FeignClient(name = "provider")
 @DubboTransported(protocol = "dubbo")
public interface ProductService {

    @RequestMapping("/getProductById")
    String getProductByUserId(@RequestParam String name);
}
