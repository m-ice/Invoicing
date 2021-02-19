package com.ice.test;

/**
 * 我们先来记住两条黄金法则：
 * 1.引用类型总是被分配到“堆”上。
 * 2.值类型总是分配到它声明的地方：
 * a.作为引用类型的成员变量分配到“堆”上
 * b.作为方法的局部变量时分配到“栈”上
 * 尚登仕品正 国应天兴顺 家和祖忠成 规举方原形
 */
public class Students {
    int id;
    String name;
    int age;

    Coumpter com;

    void study() {
        System.out.println("学生学习!! 使用的电脑是：" + com.band);
    }

    void play() {
        System.out.println("student play game!");
    }

    public static void main(String[] args) {
        Students students = new Students();
        students.play();
        Coumpter c1 = new Coumpter();
        c1.band = "联想电脑";
        students.com = c1;
        students.study();
        字符串比较 s = new 字符串比较();
        s.s2 = "aaa";
//        s.s2 = new String("aaa");
//        s.s = new String("aaa");
        System.out.println(s.s.equals(s.s2));
        System.out.println(s.s == s.s2);


    }
}

class Coumpter {
    String band;
}

class 字符串比较 {
    String s = new String("aaa");
    String s2;
}