package com.xiaoze.consumer.controller.protol;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * @author wenbaox
 * @version 1.0
 * @date 2021/4/6 下午7:52
 */
public class MyProtocal implements Protocol {

    @Override public int getDefaultPort() {
        return 889;
    }

    @Override public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        return null;
    }

    @Override public <T> Invoker<T> refer(Class<T> aClass, URL url) throws RpcException {
        return null;
    }

    @Override public void destroy() {

    }
}
    