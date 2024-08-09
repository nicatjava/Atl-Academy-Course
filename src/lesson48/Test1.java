package lesson48;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("demo.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            Integer count = 0;
            for (int i = 1; i <= 10; i++) {
                count++;
                bos.write(count.byteValue());
            }
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("demo.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();
            int sum = 0;
            for (byte b : bytes) {
                int number = b;
                sum += number;
            }
            System.out.println(sum);
            System.out.println();
            bis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
