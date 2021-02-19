package com.date20923.test01;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //直接赋值，会在字符串常量池中产生对象
        String str1 = " Hello World! ";
        //使用字符串连接符创建，实际上是通过StringBuffer或StingBuilder来构建的对象
        String str2 = "Hello" + "World! " + " ice_lucky";
        //使用new关键字创建对象
        String str3 = new String("Hello");

        String str4 = "Hello";

        System.out.println(str3.length());//得到字符串的长度 结果：5
        System.out.println(str3.charAt(3));//根据下标得到指定字符 结果：l
        System.out.println(str3.indexOf('l'));//根据字符得到其在字符串中第一次出现的下标，从0开始 结果：2
        System.out.println(str3.substring(1, 4));//根据下标截取[1,4)的子字符串 结果：ell
        System.out.println(str1.trim());//去掉字符串前后空格 结果：Hello World!
        System.out.println(str3.compareTo(str4));//比较字符大小 结果：0
        System.out.println(str4.endsWith("o"));//判断是否以指定字符结尾 结果：true
        System.out.println(str1.split("\\s+"));//根据正则表达式拆分字符串 结果：[Ljava.lang.String;@4554617c
        System.out.println(str2.replace(" ", "--->"));//替换字符串
        System.out.println(str2.replaceAll(" ", "===>"));
        System.out.println(str3.equals(str4));//判断字符串是否相等 结果：true
    }
}
