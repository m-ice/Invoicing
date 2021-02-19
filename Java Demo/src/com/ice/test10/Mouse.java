package com.ice.test10;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
//接口
public interface Mouse {
    public abstract void click();
}

class Lenovo implements Mouse {
    @Override
    public void click() {
        System.out.println("Lenovo click...");
    }
}
