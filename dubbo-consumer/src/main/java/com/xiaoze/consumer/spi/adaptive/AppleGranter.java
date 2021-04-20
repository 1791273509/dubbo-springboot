package com.xiaoze.consumer.spi.adaptive;

import com.alibaba.dubbo.common.URL;
import com.xiaoze.consumer.spi.adaptive.fruit.Apple;
import com.xiaoze.consumer.spi.adaptive.fruit.Fruit;

/**
 * @author wenbaox
 * @version 1.0
 * @date 2021/4/10 下午8:43
 */
// 苹果种植者
public class AppleGranter implements FruitGranter {

    @Override
    public Fruit grant() {
        return new Apple();
    }

    @Override
    public String watering(URL url) {
        System.out.println("watering apple");
        return "watering finished";
    }
}