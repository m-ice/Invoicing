package com.ice.test10;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Test {
    public static void main(String[] args) {
        NoNameClass n = new NoNameClass();

        //调用参数为普通类的方法
        n.m1(new Animal());//Animal a=new Animal();
        n.m1(new Dog());//Animal a=new Dog();//向上转型
        n.m1(new Animal() {//Animal a=匿名内部类对象
            @Override
            public void sleep() {
                System.out.println("普通类实现匿名内部类");
            }
        });

        //调用参数为抽象类的方法
        n.m2(new MyComputer());//Computer c=new MyComputer 向上转型
        n.m2(new Computer() {
            @Override
            public void play() {
                System.out.println("抽象类实现匿名内部类");
            }
        });

        //调用参数为接口的方法
        n.m3(new Lenovo());//Mouse m=new Lenove();//向上转型
        n.m3(new Mouse() {
            @Override
            public void click() {
                System.out.println("接口实现匿名内部类");
            }
        });
    }

}
