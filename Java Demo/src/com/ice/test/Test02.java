package com.ice.test;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Test02 {
    public static void main(String[] args) {

        People p1 = new People("max", 23);
        p1.setCity("北京");
        System.out.println(p1);

        People p2 = new People("小龙", 21);
        p2.setCity("贵阳");
        System.out.println(p2);

        People p3 = new People("小敏", 22);
        System.out.println(p3);
    }

}
