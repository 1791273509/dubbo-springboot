package com.xiaoze.consumer.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author wenbaox
 * @version 1.0
 * @date 2021/4/6 下午8:54
 *
 */
@SPI("default")
public interface MySpi {
    String say();
}
    