package com.ice.test10;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
//抽象类
public abstract class Computer {
    public abstract void play();
}

class MyComputer extends Computer {
    @Override
    public void play() {
        System.out.println("MyComputer play...");
    }
}