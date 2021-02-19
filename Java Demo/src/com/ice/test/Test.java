package com.ice.test;

import java.math.BigDecimal;

public class Test extends HelloWorld {
    public Test() {

    }
    

    public void date1(double a, int b) {
        double s = a - b;
        System.out.println(s);
    }

    @Override
    public BigDecimal date(double a, int b) {
        super.date(a, b);
        BigDecimal a1 = BigDecimal.valueOf(a);
        return a1.subtract(BigDecimal.valueOf(b));
    }

    public static void main(String[] args) {
        System.out.println(new Test().date(33.3, 4));
        long L = System.currentTimeMillis();
        System.out.println(55 + "的阶层是：" + f(55));
        long L1 = System.currentTimeMillis();
        System.out.printf("耗时为：%s", L1 - L);
        // f2(10);

    }

    static long f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }

    static long f2(int n) {
        int a = n;
        long t1 = System.currentTimeMillis();
        long result = 1;
        while (n > 1) {
            result *= n * (n - 1);
            n -= 2;
        }
        long t2 = System.currentTimeMillis();
        System.out.printf("%n%d的阶层是%s%n耗时为：%s", a, result, t2 - t1);
        return result;
    }
}
