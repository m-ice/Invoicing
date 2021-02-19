package com.ice.test;

class Point {
    /* double x, y;

     *//*    public Point(double _x, double _y) {
        x = _x;
        y = _y;
    }*//*

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point p) {
        return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
    }

}

public class TestConstructor {

    public static void main(String[] args) {
        Point p = new Point(3.0, 4.0);
        Point orgin = new Point(0, 0);
        System.out.println(p.getDistance(orgin));
    }*/
    int id;
    String name;

    public Point(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void t1(Point point) {
        point.name = "123";
    }

    public void t2(Point point) {
        point = new Point(12, "333");
    }

    public static void main(String[] args) {
        Point point = new Point(11, "321");
        point.t1(point);
        System.out.println(point.name);
        point.t2(point);
        System.out.println(point.name);

        java.util.Date date = new java.util.Date();
        System.out.println(date.getTime());

        System.out.println(Math.PI);
        /*java.sql.Date date1 = new java.sql.Date();*/
    }
}
