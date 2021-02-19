package cn.iceson.test;

import java.util.Objects;

public class TestEquls extends Test {
    int id;
    String uname;
    String password;

    static {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        TestEquls testEquls1 = new TestEquls(1000, "max", "123456");
        TestEquls testEquls2 = new TestEquls(1001, "min", "123456");

        String s1 = new String("123");
        String s2 = "123";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(testEquls1.equals(testEquls2));
    }

    public TestEquls(int id, String uname, String password) {
        this.id = id;
        this.uname = uname;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEquls testEquls = (TestEquls) o;
        return id == testEquls.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class Test {
    static {
        System.out.println("Hello World2！");
    }
}