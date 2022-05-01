package cn.studybigdata.java.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class SocketClient extends Socket {

    public static void main(String[] args) throws IOException {
//        Socket socket = new Socket("localhost",9999);
//        Socket socket = new Socket("192.168.179.100",9999);
        Socket socket = new Socket("118.178.232.180",80);



        while (true){
            InputStream inputStream = socket.getInputStream();
            byte [] bytes = new byte[1024];
            int read = inputStream.read(bytes);

            for (byte aByte : bytes) {
                System.out.println(Integer.toBinaryString((int) aByte));
            }
            String in = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(in);
        }
    }
}
