package cn.ice.oop.polymorphism.myServlet;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class HttpServlet {
    public void service(){

        System.out.println("HttpServlet.service()");
        doGet();
    }
    public void doGet(){
        System.out.println("HttpServlet.doGet()");
    }
}
