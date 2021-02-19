package com.ice.beans;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Person {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(){

    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
