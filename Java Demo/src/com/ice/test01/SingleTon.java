package com.ice.test01;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
//懒汉模式
public class SingleTon {
    public double r = Math.random();
    private static SingleTon single = null;

    //私有化构造器，不让其他类创建对象
    private SingleTon() {

    }

    //静态工厂：专门用来生产类的实例
    public static SingleTon getInstance() {
        if (single == null) {
            single = new SingleTon();
        }
        return single;
    }

}
