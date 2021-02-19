package com.ice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Server {
    private ServerSocket server= null;
    public static void main(String[] args) {
        Server server=new Server();
        server.start();
    }

    /**
     * 启动方法
     */
    public void start(){
        try {
            server = new ServerSocket(8888);
            this.receive();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 接收客户端
     */
    private void receive(){
        try {
            Socket client=server.accept();
            StringBuilder sb=new StringBuilder();
            String msg=null;//接收客户端的请求信息
            BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
            while ((msg=br.readLine()).length()>0){
                sb.append(msg);
                sb.append("\r\n");
                if (null==msg){
                    break;
                }
                //接收客户端请求信息
                String requestInfo=sb.toString().trim();
                System.out.println(sb.toString().trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 停止服务器
     */
    public void stop(){

    }
}
