package com.ice.test10;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class NoNameClass {
    /**
     * 普通内部类作为参数时:可以传普通类对象、子类对象、匿名内部类对象
     */
    public void m1(Animal a) {
        a.sleep();
    }

    /**
     * 抽象类作为参数时：可以传递子类对象，匿名内部类对象
     *
     * @param c
     */
    public void m2(Computer c) {
        c.play();
    }

    /**
     * 参数作为接口时：可以传递实现类对象，匿名内部类对象
     *
     * @param m
     */
    public void m3(Mouse m) {
        m.click();
    }
}
