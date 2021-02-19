package cn.ice.oop.callbreak;


/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class PaintFrame {
    public static void drawFrame(MyFrame f){
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");

        //画窗口
        f.paint();
        System.out.println("启动循环，增加效率");
    }

    public static void main(String[] args) {
        drawFrame(new GrameFrame02());
    }
}

class GrameFrame01 extends MyFrame{
    @Override
    public void paint() {
        System.out.println("画窗口GrameFrame01.paint()");
    }
}

class GrameFrame02 extends MyFrame{
    @Override
    public void paint() {
        System.out.println("画窗口GrameFrame02.paint()");
    }
}