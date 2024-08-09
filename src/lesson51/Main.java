package lesson51;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,45,54,123,90,60,100);
        list.forEach(n -> System.out.println(n));

        list.stream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer + " ")
                .forEach(integer -> System.out.println(integer));

        List<String> list2 = new Random().ints(50,0,102)
                .filter(integer -> integer % 2 != 0)
                .boxed()
                .map(integer -> integer+"")
                .toList();
    }
}
