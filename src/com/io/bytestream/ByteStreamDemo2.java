package com.io.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Crayon
 * @ClassName ByteStreamDemo2
 * @description 字节输入流
 * @date 2026/10/11 14:02
 */

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {

        /**
         * 1.文件不存在会直接报错
         * 2.读取出来的是数据是ASCII对应的数字
         * 3.读到文件末尾时，read方法返回-1
         */

        FileInputStream fis = new FileInputStream("fileinputstream.txt");
        int b;
        while((b = fis.read()) != -1){
            System.out.print((char)b);
        }

        fis.close();
    }
}
