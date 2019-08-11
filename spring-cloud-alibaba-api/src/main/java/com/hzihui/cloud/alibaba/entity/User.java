package com.hzihui.cloud.alibaba.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author HZI.HUI
 * @date 2019/8/7 22:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {

    private static final long serialVersionUID = -1170712489013521742L;
    private String id;

    private String name;

    private String gender;

    private Integer age;
}
