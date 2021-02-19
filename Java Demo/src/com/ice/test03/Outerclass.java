package com.ice.test03;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
//外部类
public class Outerclass extends Other implements Inf1 {
    public static int a = 0;

    @Override
    public void start() {//启动

    }

    @Override
    public void othereat() {

    }

    //内部类
    class InnerClass {
    }

    //内部类实现接口
    class InnerClassInf implements Inf2 {

        @Override
        public void start() {//开始

        }
    }

    //内部类继承抽象类
    class InnerClassAbstract extends Animal {

        @Override
        public void eat() {

        }
    }

}
