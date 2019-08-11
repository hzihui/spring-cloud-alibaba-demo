package com.hzihui.cloud.alibaba.vo;

import com.hzihui.cloud.alibaba.entity.User;
import lombok.Data;

import java.io.Serializable;

/**
 * @author HZI.HUI
 * @date 2019/8/7 22:05
 */
@Data
public class UserVO extends User implements Serializable {

    private static final long serialVersionUID = -3342623646828335179L;

    String bakcName;
}
