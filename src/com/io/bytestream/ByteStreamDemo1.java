package com.io.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Crayon
 * @ClassName ByteStreamDemo1
 * @description 字符输出流
 * @date 2026/10/11 13:38
 */

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {

        /**
         * 1.参数是字符串表示的路径或者是File对象都是可以
         * 2.如果文件不存在会创建一个新文件，但是要保证父级路径存在
         * 3.如果文件已经存在，则会清空文件,可以加true打开续写开关
         * 4.write方法的参数是整数，但是写入的为整数对应的ASCII的值
         */

        //文件名后加true，打开续写开关，那么就不会清空文件，默认为false
        FileOutputStream fos = new FileOutputStream("fileoutputstream.txt",false);
        //void write(int b)
        fos.write(97);

        //void write(byte[] b)
        byte[] b = {98,99,100,101,102};
        fos.write(b);

        String wrap = "\r\n";
        byte[] jump = wrap.getBytes();
        fos.write(jump);

        //void write(byte[] b, int off, int len)
        String str = "hello world!";
        byte[] b2 = str.getBytes();
        fos.write(b2,6,5);

        fos.close();
    }
}
