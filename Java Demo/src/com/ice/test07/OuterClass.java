package com.ice.test07;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class OuterClass {
    public int a = 10;

    public void fun() {
        //局部变量
        final int x = 100;
        /**
         * 局部内部类：定义在方法内部或参数位置
         * 作用域只在该方法内有效，不能使用权限修饰符
         */
        class InnerClass {
            public void test() {
                System.out.println(OuterClass.this.a);//访问外部类成员，通过“外部类名.this.外部对象

                System.out.println(x);//访问方法的局部变量，但是这个局部变量必须由final修饰
            }
        }
    }
}
