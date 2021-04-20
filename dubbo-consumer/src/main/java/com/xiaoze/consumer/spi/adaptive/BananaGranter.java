package com.xiaoze.consumer.spi.adaptive;

import com.alibaba.dubbo.common.URL;
import com.xiaoze.consumer.spi.adaptive.fruit.Banana;
import com.xiaoze.consumer.spi.adaptive.fruit.Fruit;

/**
 * @author wenbaox
 * @version 1.0
 * @date 2021/4/10 下午8:43
 */

// 香蕉种植者
public class BananaGranter implements FruitGranter {

    @Override
    public Fruit grant() {
        return new Banana();
    }

    @Override
    public String watering(URL url) {
        System.out.println("watering banana");
        return "watering success";
    }
}