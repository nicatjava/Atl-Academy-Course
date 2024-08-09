package lesson48;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("demo.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Hello World!".getBytes());
            bos.close();
            fos.close();
        } catch (IOException e ) {
            e.printStackTrace();
        } finally {
            System.out.println("Hello");
        }

        try {
            FileInputStream fis = new FileInputStream("demo.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();
            for (byte b : bytes) {
                char c = (char) b;
                System.out.print(c);
            }
            System.out.println();
            bis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hello!");
        }
    }
}
