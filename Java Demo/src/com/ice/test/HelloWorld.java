package com.ice.test;

import java.math.BigDecimal;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        /*float a = 4.4444455f;
        System.out.println(a);
        double b = 4.4444455;
        System.out.println(b);
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        System.out.println(a == b);
        System.out.println(a1 == b1);
        float c = 33e-2f;
        double d = 33e-2d;
        System.out.println(d);

        b1 = b1.subtract(BigDecimal.valueOf(0.4444455));
        b = b - 0.4444455;
        System.out.println(b1);
        System.out.println(b);*/

       /* char s = '\u0077';

        System.out.println(s);

        System.out.println('a' + "\t" + 'b');*/

       /* for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }

        System.out.println("abc" + "\n" + "def");//换行
        System.out.print("123" + "\r" + "456");//回车
        System.out.println(23 + "  " + "\b" + 456);//退格
        System.out.println(23 + "\'" + 456);//
        System.out.println("23" + '"' + "456");*/
        /*float i1 = 100.00001f;
        float i2 = 100.0f;
        Double i3 = 200.0;
        Double i4 = 200.0;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        int a = 12 << 1;
        System.out.println(a);

        byte c = 0b1111111;
        int c1 = 5 + 4 / 2;
        float f1 = c;

        System.out.println(f1);

        int x = 1;
        int y = x++;
        int y1 = ++x;
        System.out.println(y);
        System.out.println(y1);
        boolean boo = 1 > 2 && 0 < 1;

        System.out.println(1 > 2 || 2 > 1);*/

        /*int a = 3;
        int b = 4;

        System.out.println(~a);
        System.out.println(~b);
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a << 1);
        System.out.println(b >> 1);

        char x = 'a';
        System.out.println((0 + x) << 1);*/

        /*int score = 70;

        double x = 3.14;

        double z = 4.44;
        BigDecimal b = BigDecimal.valueOf(x);

        System.out.println(x);

        System.out.println(x - 0.01);

        System.out.println(b.subtract(BigDecimal.valueOf(0.01)));
        System.out.println(b.subtract(BigDecimal.valueOf(z)));

        System.out.println(b.subtract(BigDecimal.valueOf(z)));


        String a = score < 60 ? "不及格" : "及格";

        System.out.println(a);

        double y = 0.001;
        System.out.println(y);
        System.out.println(y - 0.0001);
        System.out.println(y - 0.0001 == 0.00009);*/

        /*Scanner in = new Scanner(System.in);

        System.out.println("请输入你的名字：");
        String s = in.nextLine();

        System.out.println("请输入你的爱好:");
        String s1 = in.nextLine();

        System.out.println("请输入你的年龄：");
        int age = in.nextInt();

        System.out.println("####################");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(age);*/

       /* Random r = new Random();
        int i = r.nextInt(11) + 1;

        System.out.println(i);*/

        /*char a = 'a';
        int c = (int) (26 * Math.random());
        char c1 = (char) (c + (int) a);

        switch (c1) {
            case 'a':
            case 'o':
            case 'i':
            case 'u':
            case 'e':
                System.out.println(c1 + "是元音字母");
                break;
            case 'w':
            case 'v':
                System.out.println(c1 + "是半元音字母");
                break;
            default:
                System.out.println(c1 + "是辅音字母");
        }*/

        /*int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println(sum);*/

        int sum = 0;
        for (int i = 2; i != 2; i++) {
            sum += i;
        }
        System.out.println(sum);

        /**
         * 执行步骤
         * 1. 执行初始化语句：i=2;
         * 2. 判断 ：i!=2
         * 3. 执行循环体
         * 4. 步径迭代；i++
         * 5。 回到第二步继续判断
         */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        System.out.println("#######################");

        //int j=1;
        for (int i = 1, j = 1; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
                j++;
            }
            if (j == 6) {
                System.out.println("");
                j = 1;
            }
        }
        outer:
        for (int j = 1; j <= 5; j++) {
            System.out.println();
            for (int i = 1; i < 5; i++) {
                System.out.print(i + "\t");
                if (j * i == 6) {
                    break outer;
                }
            }
        }
        //new HelloWorld().date(33.3, 4);
    }
/*
    public static void date(int a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }*/

    public BigDecimal date(double a, int b) {
        BigDecimal a1 = BigDecimal.valueOf(a);
        return a1.add(BigDecimal.valueOf(b));
    }
}

