package com.xiaoze.consumer.spi.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @author wenbaox
 * @version 1.0
 * @date 2021/4/10 下午8:44
 */
public class Demo {

    // 参考链接
    public static void main(String[] args) {
        URL url = URL.valueOf("dubbo://192.168.0.101:20880?fruit.granter=apple");

        ExtensionLoader.getExtensionLoader(FruitGranter.class).getExtension("apple").watering(url);
        url = URL.valueOf("dubbo://123.1221.121.1:20880");
        ExtensionLoader.getExtensionLoader(FruitGranter.class).getAdaptiveExtension().watering(url);
    }

}
    