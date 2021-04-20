package com.xiaoze.consumer.spi;

import java.util.Arrays;

/**
 * @author wenbaox
 * @version 1.0
 * @date 2021/4/6 下午8:54
 */
public class MySpiImpl2 implements MySpi {

    public static void main(String[] args) {
        int v = (int) (Math.pow(2, 31) - 1);
        System.out.println(v - Integer.MAX_VALUE);
        long x = 1;
        for (int i = 0; i < 62; i++) {
            x *= 2;
        }
        System.out.println(x * 2 - 1);
        System.out.println(Long.MAX_VALUE);
        System.out.println("dddddddd");
        System.out.println("dfdaf fdafd  dfafs".split(" ").length);
        System.out.println(Arrays.toString("dfdaf fdafd  dfafs".split("\\s+")));
        System.out.println(Arrays.toString("dfdaf 是 fdafd  dfafs".split("\\s+")));
        System.out.println(Arrays.toString("dfdaf , 是, fdafd,dfafs".split("\\s*[,]+\\s*")));
        System.out.println(Arrays.toString("dfdaf , 是, fdafd,dfafs".split("\\s*,\\s*")));
        System.out.println(Arrays.toString("dfdaf , 是, fdafd,dfafs".split(",")));
    }

    @Override public String say() {
        System.out.println("MySpiImpl2");
        return "MySpiImpl";
    }
}
    