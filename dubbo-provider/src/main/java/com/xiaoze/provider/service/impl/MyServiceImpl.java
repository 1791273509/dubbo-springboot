package com.xiaoze.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaoze.api.service.MyService;

/**
 * @author wenbaox
 * @version 1.0
 * @date 2021/4/2 下午11:59
 */
@Service
public class MyServiceImpl implements MyService {
    @Override public String user() {
        return "{\"id\":\"12\"}";
    }
}
    