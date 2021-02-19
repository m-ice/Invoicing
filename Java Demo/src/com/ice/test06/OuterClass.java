package com.ice.test06;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
//外部类
public class OuterClass {

    //静态内部类
    public static class InnerClass {
        public static int a = 10;

        public static void fun() {
            System.out.println("statie fun...");
        }
    }

    public void test() {
        System.out.println(InnerClass.a);
    }
}
