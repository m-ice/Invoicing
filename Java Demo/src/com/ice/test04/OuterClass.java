package com.ice.test04;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public abstract class OuterClass {
    int a;//成员变量
    static int b;//静态变量
    final static int C = 10;//常量

    {
        //初始化块
    }

    static {
        //静态初始化块
    }

    public OuterClass() {
        //构造器

    }

    public void fun1() {
        //成员方法

    }

    public static void fun2() {
        //静态成员方法

    }

    public abstract void fun3();//抽象方法

    class InnerClass {
        //内部类
        
    }

}
