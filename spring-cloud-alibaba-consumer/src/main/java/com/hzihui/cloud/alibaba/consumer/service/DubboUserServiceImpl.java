package com.hzihui.cloud.alibaba.consumer.service;

import com.hzihui.cloud.alibaba.entity.User;
import com.hzihui.cloud.alibaba.service.ProductService;
import com.hzihui.cloud.alibaba.service.UserService;
import com.hzihui.cloud.alibaba.vo.UserVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author HZI.HUI
 * @date 2019/8/7 22:07
 */
@Service("dubboUserService")
public class DubboUserServiceImpl implements UserService {

    @Reference(interfaceName = "dubboProductService",version = "1.0.0")
    private ProductService productService;

    @Override
    public UserVO getUserAndProductsByUserId(String userId) {
        User user = User.builder().id("1000").name("Dubbo").gender("男").age(28).build();
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user,userVO);
        userVO.setBakcName(productService.getProductByUserId(user.getName()));
        return userVO;
    }
}
