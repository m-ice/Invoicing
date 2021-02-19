package cn.ice.oop.testInterface;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
//接口可以多继承
public interface InterfaceA {
    void a();
}
interface InterfactB{
    void b();
}
interface InterfaceC extends InterfaceA,InterfactB{
    void c();
}
class TestClass implements InterfaceC{
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}
