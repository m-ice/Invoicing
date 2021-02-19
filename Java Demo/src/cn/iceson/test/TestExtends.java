package cn.iceson.test;

public class TestExtends {
    public static void main(String[] args) {
        Students students = (Students) new Person().s();
        System.out.println(students.information());
        System.out.println(students.toString());
        int[] a = new int[3];
        a[0] = 12;
        a[1] = 33;
        a[2] = 22;
        for (int i : a
        ) {
            System.out.println(i);

        }
    }
}

class Person implements TestInterface {
    char sex;
    String id;
    String name;
    int age;

    @Override
    public String information() {
        return "性别:" + sex + "\n身份证号：" + id + "\n姓名：" + name + "\n年龄：" + age;
    }

    Person s() {
        return new Students('男', "1234567890", "max",
                24, "38381717216", "计算机科学与技术");
    }
}

class Students extends Person implements TestInterface, StudyInterface {
    String sno;
    String zy;

    @Override
    public String toString() {
        return "Students{" +
                "sex=" + sex +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sno='" + sno + '\'' +
                ", zy='" + zy + '\'' +
                '}';
    }

    public Students(char sex, String id, String name, int age, String sno, String zy) {
        this.sex = sex;
        this.id = id;
        this.name = name;
        this.age = age;
        this.sno = sno;
        this.zy = zy;
    }

    public String information() {
        return "性别:" + sex + "\n身份证号：" + id + "\n姓名：" + name + "\n年龄：" + age + "\n学号：" + sno + "\n专业：" + zy;
    }

    @Override
    public void play() {
        System.out.println("I Love play 王者荣耀！");
    }

    @Override
    public void loveBook() {
        System.out.println("I love see Thanking in Java!");
    }
}