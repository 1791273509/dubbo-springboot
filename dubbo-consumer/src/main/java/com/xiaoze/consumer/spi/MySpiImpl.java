package com.xiaoze.consumer.spi;

/**
 * @author wenbaox
 * @version 1.0
 * @date 2021/4/6 下午8:54
 */
public class MySpiImpl implements MySpi{

    @Override public String say() {
        System.out.println("MySpiImpl");
        return "MySpiImpl";
    }
}
    