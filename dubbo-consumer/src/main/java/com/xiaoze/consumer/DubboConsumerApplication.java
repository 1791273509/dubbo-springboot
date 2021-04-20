package com.xiaoze.consumer;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.rpc.Protocol;
import com.xiaoze.consumer.spi.MySpi;
import java.util.Arrays;
import java.util.List;
import java.util.ServiceLoader;
import java.util.regex.Pattern;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DubboConsumerApplication
 * 消费者启动类
 *
 * @author xiaoze
 * @date 2018/6/7
 */
@EnableDubbo
@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) {
        Pattern NAME_SEPARATOR = Pattern.compile("\\s*[,]+\\s*");
        System.out.println(Arrays.toString(NAME_SEPARATOR.split("name,dfs,dfds")));
        ServiceLoader<List> load = ServiceLoader.load(List.class);
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtoCal");
        System.out.println(protocol.getDefaultPort());
        System.out.println(ExtensionLoader.getExtensionLoader(MySpi.class).getExtension("ss").say());
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
