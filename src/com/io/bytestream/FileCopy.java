package com.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Crayon
 * @ClassName FileCopy
 * @description 文件拷贝
 * @date 2026/10/11 14:08
 */

public class FileCopy {
    public static void main(String[] args) throws IOException {

        /**
         *  1.核心思想：边读边写
         *  2.释放资源时先开的最后关闭
         */

        FileInputStream fis = new FileInputStream("D:\\aaa\\test.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\copy.mp4");
        FileInputStream longfis = new FileInputStream("D:\\aaa\\long.mp4");
        FileOutputStream longfos = new FileOutputStream("D:\\longcopy.mp4");

        //1byte1byte的转
        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }


        //开始
        long start = System.currentTimeMillis();

        //根据数组大小传，速度快
        int len;
        byte[] b1 = new byte[2];
        while((len = longfis.read(b1)) != -1){
            longfos.write(b1,0,len);
        }

        //结束
        long end = System.currentTimeMillis();
        System.out.println("2byte use time:" + (end - start));

        longfos.close();
        longfis.close();

        fos.close();
        fis.close();
    }
}
