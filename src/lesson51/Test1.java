package lesson51;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.print(list);

        int min = list.get(0);
        int max = list.get(0);;
        for (int num : list) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println();
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        int maxNum = list.stream().max(Integer::compareTo).get();
        int minNum = list.stream().min(Integer::compareTo).get();
        System.out.println(minNum+" - "+maxNum);

    }


}
