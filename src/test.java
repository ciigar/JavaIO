import java.io.*;
import java.nio.charset.Charset;

/**
 * @author Crayon
 * @ClassName test
 * @description
 * @date 2026/10/10 22:52
 */

public class test{
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("a.txt");
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"), Charset.forName("GBK"));

        FileOutputStream fos = new FileOutputStream("b.txt");
        int b;
        while ((b = fis.read()) != -1){
            fos.write((char)b);
        }

        fos.close();
        fis.close();

        System.out.println("hello" + "world");
    }
}
