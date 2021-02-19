package cn.ice.oop.testInterface;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Flyable f=new Stone();
        Stone s=(Stone)f;
        s.str="不存在f.str";
    }
}
