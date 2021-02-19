package com.ice.test09;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class NoNameClass {
    //普通类实现匿名内部类
    Animal a = new Animal() {
        @Override
        public void sleep() {
            System.out.println("匿名内部类的sleep()方法");
        }
    };
    //抽象类实现匿名内部类：在匿名内部类中必须重写抽象方法
    Computer c = new Computer() {
        @Override
        public void play() {
            System.out.println("匿名内部类的play()方法");
        }
    };

    //接口实现匿名内部类:在匿名内部类中必须重写抽象方法
    Mouse m = new Mouse() {
        @Override
        public void click() {

        }
    };
}
