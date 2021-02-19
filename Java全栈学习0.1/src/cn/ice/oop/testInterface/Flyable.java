package cn.ice.oop.testInterface;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public interface Flyable {
    int MAX_SPEED=11000;
    int MIN_HEIGHT=1;
    void fly();
}
interface Attack{
    void attack();
}
class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机飞行");
    }
}
class Man implements Flyable{
    @Override
    public void fly() {
        System.out.println("人跳起来，飞");
    }
}
class Stone implements Flyable,Attack{
    String str;
    @Override
    public void fly() {
        System.out.println("石头被抛出去");
    }

    @Override
    public void attack() {
        System.out.println("石头攻击了狼");
    }
}