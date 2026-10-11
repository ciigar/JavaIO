package com.io.method;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Crayon
 * @ClassName MethodDemo1
 * @description 文件的方法
 * @date 2026/10/11 13:17
 */

public class MethodDemo1 {
    public static void main(String[] args) throws IOException {
        //aaa为文件夹
        File f1 = new File("D:\\aaa");
        File f2 = new File("D:\\aaa\\aaaaa.txt");

        //打印系统中所有的盘符
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        //list 获取当前路径下的所有内容
        String[] arr2 = f1.list();
        for (String s : arr2) {
            System.out.println(s);
        }

        //list文件名过滤器
        String[] arr3 = f1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                    return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println("过滤后:" + Arrays.toString(arr3));

        //创建文件
        System.out.println("create success? " + f2.createNewFile());

        //是否为文件夹
        System.out.println("f1 is directory? " + f1.isDirectory());
        System.out.println("f2 is directory? " + f2.isDirectory());
    }
}
