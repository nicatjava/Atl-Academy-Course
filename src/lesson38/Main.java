package lesson38;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        File file = new File("number.txt");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            for (int i = 1; i < 10; i++) {
                if(i==9){
                    fw.write(String.valueOf(i));
                }
                else{
                    fw.write(i+" ");
                }
            }
            fw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
            }

            System.out.println(sum);


        } catch (IOException e) {
            System.out.println("Bir səhv baş verdi.");
            e.printStackTrace();
        }
    }
}
