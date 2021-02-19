package com.ice.test;

public class Stucks {
    int id = 20201428;
    String name = "max";
    int age = 22;

    public void information() {
        System.out.println("学号：" + id + "\n姓名：" + name + "\n年龄" + age);
    }

    public void computer(Compute c1) {
        information();
        System.out.println("我佩带的电脑是：" + c1.bread);
    }

    public static void main(String[] args) {
        Compute c = new Compute();
        c.bread = "联想";
        Stucks s = new Stucks();
        s.computer(c);

    }
}

class Compute {
    String bread;
}