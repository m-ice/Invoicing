package com.ice.test08;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 * 匿名内部类：
 * 1.在成员变量赋值时创建
 * 2.在方法内部定义并直接使用
 * 3.在方法参数位置创建
 */
//外部类
public class NoNameClass {
    Animal a = null;//声明引用对象时使用默认值null
    Animal a2 = new Animal();//声明引用变量时就创建对象

    /**
     * 1.在成员变量赋值时创建
     */
    //声明引用变量并创建匿名内部类对象 new 类名（）{}--->匿名内部类对象
    Animal a3 = new Animal() {
        @Override
        public void eat() {
            super.eat();
        }
    };

    /**
     * 2.在方法内部定义并直接使用
     */

    public void fun() {
        //匿名内部类--->匿名对象，用完一次就回收
        new Animal() {
        };
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("匿名内部类的eat方法");
            }
        };
        a.eat();
    }

    /**
     * 3.在方法参数位置创建
     *
     * @param a
     */
    public void m(Animal a) {

    }

    public static void main(String[] args) {
        new NoNameClass().m(new Animal() {//在方法参数位置创建

        });
    }
}
