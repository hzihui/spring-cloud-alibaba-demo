package com.hzihui.cloud.alibaba.consumer.service;

import com.hzihui.cloud.alibaba.entity.User;
import com.hzihui.cloud.alibaba.service.ProductService;
import com.hzihui.cloud.alibaba.service.UserService;
import com.hzihui.cloud.alibaba.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author HZI.HUI
 * @date 2019/8/7 22:07
 */
@Service("userService")
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final ProductService productService;

    @Override
    public UserVO getUserAndProductsByUserId(String userId) {
        User user = User.builder().id("2000").name("Feign").gender("男").age(18).build();
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user,userVO);
        userVO.setBakcName(productService.getProductByUserId(user.getName()));
        return userVO;
    }
}
