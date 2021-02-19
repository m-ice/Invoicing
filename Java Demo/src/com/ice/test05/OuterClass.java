package com.ice.test05;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class OuterClass {
    int a = 10;//成员变量
    static int b = 20;//静态变量

    /**
     * 在外部类中访问成员内部类:new 内部类名().内部类对象
     */
    //成员方法
    public void fun() {
        System.out.println(new InnerClass().x);
    }

    //成员内部类
    class InnerClass {
        int x = 10;

        //        static int y=20;//内部类中不能存在静态成员

        /**
         * 在成员内部类中访问外部类：外部类类名.this.外部类对象
         * this在内部类中表示当前的内部类对象
         */
        public void fun() {
            System.out.println(OuterClass.this.a);
            System.out.println(this.x);
        }
    }
}
