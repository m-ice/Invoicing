package com.ice.test01;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Test {

    public static void main(String[] args) {
        SingleTon single1 = SingleTon.getInstance();
        System.out.println(single1.r);
        SingleTon single2 = SingleTon.getInstance();
        System.out.println(single2.r);
    }
}
