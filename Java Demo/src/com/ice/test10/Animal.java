package com.ice.test10;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
//普通类
public class Animal {
    public void sleep() {
        System.out.println("Animal sleep...");
    }
}

class Dog extends Animal {
    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }
}
