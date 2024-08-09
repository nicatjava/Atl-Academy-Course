package lesson38;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
//            file.createNewFile();
//            FileWriter fw = new FileWriter(file);
//            fw.write("Fayl yolu: " + file.getAbsolutePath());
//            fw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Bir səhv baş verdi.");
            e.printStackTrace();
        }
    }
}
