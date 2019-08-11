package com.hzihui.cloud.alibaba.service;

import com.hzihui.cloud.alibaba.vo.UserVO;

/**
 * @author HZI.HUI
 * @date 2019/8/7 22:05
 */
public interface UserService {

   UserVO getUserAndProductsByUserId(String userId);
}
