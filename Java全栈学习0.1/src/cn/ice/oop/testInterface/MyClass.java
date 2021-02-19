package cn.ice.oop.testInterface;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class MyClass implements MyInterfact {
    @Override
    public void test01() {
        System.out.println("MyClass.test01()");
    }
    @Override
    public int test02(int a, int b) {
        return MAX_SPEED+1;
    }
}
