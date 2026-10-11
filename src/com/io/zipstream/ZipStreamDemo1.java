package com.io.zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author Crayon
 * @ClassName ZipStreamDemo1
 * @description 解压缩流
 * @date 2026/10/11 1:34
 */

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\aaa.zip");
        File dest = new File("D:\\");
        unzip(src,dest);
    }

    public static void unzip(File src, File dest) throws IOException {


        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;
        while((entry = zip.getNextEntry()) != null){
            System.out.println(entry);
            if(entry.isDirectory()){
                File file = new File(dest,entry.toString());
                file.mkdirs();
            }else{
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b = zip.read()) != -1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
