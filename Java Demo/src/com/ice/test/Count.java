package com.ice.test;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Count {
    public int number;

    private static int count;//用于计数

    //用于初始静态变量，先于构造器执行
    static {
        System.out.println("类加载时执行了并且被执行一次");
        count = 1;
    }

    public static int getCount() {
        return count;
    }

    public Count() {
        count++;
        number = count;
        System.out.println("构造器被执行");
    }
}
