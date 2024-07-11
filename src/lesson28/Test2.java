package lesson28;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Index for Delete: ");
        int index = sc.nextInt();

        ArrayList<Integer> list =  new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            list.add(rand.nextInt(100));
        }

        System.out.println("before: "+list);

        if(index < 0 || index >= list.size()){
            System.out.println("Error");
        } else {
            System.out.println("random index: " + index);
            System.out.println("index value: "+list.get(index));
            list.remove(index);
            System.out.println("index deleted!");
            System.out.println("after: "+list);
        }
    }
}
