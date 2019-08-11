package com.hzihui.cloud.alibaba.provider.service;

import com.hzihui.cloud.alibaba.entity.Product;
import com.hzihui.cloud.alibaba.service.ProductService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HZI.HUI
 * @date 2019/8/7 21:33
 */
@Service(version = "1.0.0",interfaceName = "dubboProductService")
public class ProductServiceImpl implements ProductService {


    @Override
    public String getProductByUserId(String name) {
        return name + "调用了Product服务";
    }
}
