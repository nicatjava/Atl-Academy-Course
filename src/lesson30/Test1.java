package lesson30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(100);
            list.add(n);
        }
        printList(list);
        int secondMax = secondMax(list);
        System.out.println();
        System.out.println("Second Max Number: "+secondMax);
    }

    public static void printList(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static int secondMax(ArrayList<Integer> list){
        list.sort(Collections.reverseOrder());
        return list.get(1);
    }
}
