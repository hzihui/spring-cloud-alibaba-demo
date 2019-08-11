package com.hzihui.cloud.alibaba.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author HZI.HUI
 * @date 2019/8/7 21:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product implements Serializable {

    private static final long serialVersionUID = -7331710101790130857L;
    private String id;

    private String name;

    private String content;

    private BigDecimal price;

    private String userId;
}
