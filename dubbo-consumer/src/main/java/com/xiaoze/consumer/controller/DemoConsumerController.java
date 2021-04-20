package com.xiaoze.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaoze.api.service.DemoService;
import com.xiaoze.api.service.MyService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoConsumerController
 * 消费者控制层
 *
 * @author xiaoze
 * @date 2018/6/7
 */
@RestController
public class DemoConsumerController {

    //可以配置url进行直连 127.0.0.1:20880 直接进行通信
    @Reference(version = "${demo.service.version}", timeout = 11000)
    private DemoService demoService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }

    @Reference
    private MyService myService;

    @RequestMapping("/service")
    public String myService() {
        return myService.user();
    }

}
