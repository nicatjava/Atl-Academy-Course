package lesson48;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        Person person = new Person(7,"Nicat",36);

        try {
            FileOutputStream fos = new FileOutputStream("demo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream("demo.txt");
            ObjectInputStream bis = new ObjectInputStream(fis);
            Object object = bis.readObject();
            if (object instanceof Person) {
                Person p = (Person) object;
                System.out.println(p);
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
