package com.xiaoze.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaoze.api.service.DemoService;

/**
 * DemoServiceImpl
 * 服务提供类
 *
 * @author xiaoze
 * @date 2018/6/7
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Hello, " + name + " (from Spring Boot1)";
    }
}
