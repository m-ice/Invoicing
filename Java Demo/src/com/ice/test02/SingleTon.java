package com.ice.test02;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 * 内部类：就是在一个类或方法中定义的类
 * 内部类实际也是一个类，可以有成员变量和成员方法
 * 分类：成员内部类，静态内部类，局部内部类，匿名内部类
 */
//饿汉模式
public class SingleTon {
    public double r = Math.random();
    private static SingleTon single = new SingleTon();

    //私有化构造器，不让其他类创建对象
    private SingleTon() {

    }

    //静态工厂：专门用来生产类的实例
    public static SingleTon getInstance() {
        return single;
    }

}
