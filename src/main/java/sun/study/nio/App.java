package sun.study.nio;

import java.io.IOException;
import java.nio.channels.SocketChannel;

/**
 * @author Sun Mengjie
 * @version 2018/7/10-1
 * 包信息java文件
 */
public class App {

    public static  void main(String args[]){

        System.out.println("java nio 学习demo程序");
        try {
            SocketChannel channel = SocketChannel.open();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
