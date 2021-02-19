package cn.ice.oop.abstractClass;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 * 1.有抽象方法的类只能定义能抽象类
 * 2.抽象类不能实例化，及不能用new来实例化抽象类。
 * 3.抽象类可以包含属性、方法、构造方法。但是构造方法不能用来new实
 * 例，只能用来被子类调用。
 * 4.抽象类只能用来继承。
 * 5.抽象方法必须被子类实现。
 */
//抽象类抽象方法
public abstract class Animal {
    public abstract void run();//抽象方法的意义在于：将方法的设计和方法的实现分离了。
    public void breath(){
        System.out.println("呼吸！");
        run();
    }
    public Animal(){
        System.out.println("创建一个动物类！");
    }
}
class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("小猫奋斗地跑步！");
    }
}
class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("狗狗努力地跑步！");
    }
}
