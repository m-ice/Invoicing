package cn.ice.oop.testInterface;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 * 一个接口可以继承多个接口
 * 一个类可以实现多个接口
 * 一个类实现接口时必须实现接口中的所有方法
 */
public interface MyInterfact {
    //接口中只有：常量和抽象方法
    /*public static final 接口中定义常量时都有该代码，写或不写都有*/
    String MAX_GREAD="Boss";
    int MAX_SPEED=125;

    /*public abstract 接口中定义方法时都有该代码，写或不写都有 所以接口中的方法都是抽象方法*/
    void test01();
    public int test02(int a,int b);
}
