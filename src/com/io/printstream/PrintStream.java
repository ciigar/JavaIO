package com.io.printstream;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Crayon
 * @ClassName PrintStream 打印流
 * @description 字符打印流以及字节打印流
 *              字符打印流带缓冲区，字节打印流不带
 *              字符打印流可以开启autoflash刷出缓冲区，特有println自动换行
 *              字节打印流自带autoflash，特有println自动换行
 * @date 2026/10/11 0:01
 */

public class PrintStream {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("printstream.txt"),false);
        pw.print(111);
        pw.println("你好你好");
        pw.printf("%s爱上了%s","阿珍","阿强");
        pw.close();


    }
}
