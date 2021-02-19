package com.ice.test11;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Father {
    private String name = "max";

    class Child {
        public void getValue() {
            System.out.println(Father.this.name);
        }
    }

    public void getValue() {
        Child c = new Child();
        c.getValue();
    }
}
