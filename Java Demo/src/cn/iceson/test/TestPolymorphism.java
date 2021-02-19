package cn.iceson.test;

public class TestPolymorphism {
    public static void main(String[] args) {
        animalCry(new Animal());
        Animal dog = new Dog(); //自动向上转型
        animalCry(dog);
//        dog.seeDoor();//编译器报错
        Dog dog1 = (Dog) dog; //强制性向下转型
        dog1.seeDoor();
        Cat cat = new Cat();
        animalCry(cat);
//        Cat cat1 = (Cat) dog;//编译器会报java.lang.ClassCastException错误

        //静态初始化
        User[] u1 = {new User(21, "max"),
                new User(22, "min"),
                new User(25, "mice")};
        //foreach循环:用于读取数组元素的值，不能修改数组元素的值
        for (User i : u1
        ) {
            System.out.println("age:" + i.age + "  name:" + i.name + "\t");
        }
        //默认初始化
        int[] u2 = new int[3];//默认给数组元素进行赋值，赋值规则和成员变量的赋值规则一致
        for (int i = 0; i < u2.length; i++) {
            System.out.print(u2[i] + "\t");
        }
        System.out.println();
        //动态初始化
        User[] u3 = new User[3];
        u3[0] = new User(21, "max");
        u3[1] = new User(22, "min");
        u3[2] = new User(25, "mice");
        for (User i : u3
        ) {
            System.out.println("age:" + i.age + "  name:" + i.name + "\t");
        }

    }

    static void animalCry(Animal a) {
        a.shot();
    }
}

class Animal {
    public void shot() {
        System.out.println("叫了一声！");
    }
}

class Dog extends Animal {

    @Override
    public void shot() { //对shot方法的重写
        System.out.println("汪汪汪......!");
    }

    public void shot(String l) {//对shot方法的重载
        System.out.println("汪汪汪......!" + l);
    }

    public void seeDoor() {
        System.out.println("对主人最忠心的动物,主要负责看门！");
    }
}

class Egg extends Animal {
    @Override
    public void shot() {
        System.out.println("鹅鹅鹅......!");
    }
}

class Cat extends Animal {
    @Override
    public void shot() {
        System.out.println("喵喵......!");
    }
}

class User {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}