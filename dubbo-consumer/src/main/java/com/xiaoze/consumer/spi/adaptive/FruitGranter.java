package com.xiaoze.consumer.spi.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;
import com.xiaoze.consumer.spi.adaptive.fruit.Fruit;

/**
 * @author wenbaox
 * @version 1.0
 * @date 2021/4/10 下午8:42
 */
@SPI("banana")
public interface FruitGranter {

    Fruit grant();

    @Adaptive
    String watering(URL url);
}
    