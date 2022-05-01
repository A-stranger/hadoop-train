package cn.studybigdata.java.encoding;

import org.apache.commons.io.Charsets;

import java.nio.charset.Charset;
import java.util.SortedMap;

//https://www.cnblogs.com/fortunely/p/14277050.html
public class Character {
    public static void main(String[] args) {

        byte m = 0b01111111; //byte表示范围为 -128到127
        int i = Byte.toUnsignedInt(m);
        System.out.println(i);

        //二进制表示的整数
        int n = 0b0111_1111_1111_1111_1111_1111_1111_1111;

        //二进制表示整数
        int pai = 0b0000_0000_1010_0101;
        //二进制转16进制字符串
        System.out.println(Integer.toHexString(pai));
        int a = 12;
        //十进制转二进制字符串
        System.out.println(Integer.toBinaryString(a));
        //



        int b = 0x2122;
        byte [] b1 = new byte[]{0b00100001, 0b00100010};


        String s = new String(b1, Charset.forName("GBK"));
        char y = '\u2122'; //该16进制数使用Unicode解码，对应一个字符

        System.out.println(s);


        String d = "abc";
        char c = d.charAt(0);
        System.out.println(c);
        System.out.println(d.length());

//        JAVA中其实用的是UTF-16编码
//        https://blog.csdn.net/weixin_44958119/article/details/115579329

//        为什么 Java 内部使用 UTF-16 表示字符串？
//        https://www.jianshu.com/p/957b249a02d8
//        int lowBits = 0x1D546 - 0x10000;
        int lowBits = 0x1F600 - 0x10000;

        // 由于char 的长度为 16 位，采用代理对方式表示（surrogate pair）必须使用两个 char，并使用 String 包装
        char highSurrogate = (char) ((lowBits >> 10) + 0xD800);
        char lowSurrogate = (char) ((lowBits & 0x3FF) + 0xDC00);
        String smile = new String(new char[]{highSurrogate, lowSurrogate});
        System.out.println(smile);
        System.out.println(smile.length());


    }
}
