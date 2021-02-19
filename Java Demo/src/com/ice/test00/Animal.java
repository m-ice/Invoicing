package com.ice.test00;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Animal {
    //成员变量
    int age;
    String name;

    //成员方法
    public void eat() {
        System.out.println("eat...");
    }

    /**
     * 被static修饰的变量：静态变量（类变量）
     * 被static修饰的方法：静态方法（类方法）
     * 静态变量和静态方法称为静态成员
     * 静态成员通过"类名.“访问（标准）或者”对象.“访问（非标准，不推荐使用）
     * <p>
     * static修饰的方法或代码块中不能使用this与super
     * static不能修饰构造器
     */
    //静态变量
    static char sex;
    static int foot;

    //静态方法
    public static void sleep() {
        System.out.println("sleep...");
    }

    public static void main(String[] args) {
        //通过”类名.“访问静态成员
        System.out.println(Animal.sex);
        System.out.println(Animal.foot);
        Animal.sleep();

        //通过”对象.“访问静态成员  非标准的，不推荐使用
        Animal a = new Animal();
        System.out.println(a.sex);
        System.out.println(a.foot);
        a.sleep();
    }
}
