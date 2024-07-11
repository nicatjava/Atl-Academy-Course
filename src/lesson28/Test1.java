package lesson28;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            list.add(rand.nextInt(100));
        }

        Collections.sort(list);
        list.remove(24);

        System.out.println(list);
    }
}
