package com.xiaoze.consumer.adaptive;

import com.alibaba.dubbo.common.URL;

/**
 * @author wenbaox
 * @version 1.0
 * @date 2021/4/7 下午10:58
 */
public interface WheelMaker {
    Wheel makeWheel(URL url);
}