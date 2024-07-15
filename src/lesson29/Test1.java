package lesson29;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Smith",20),
                new Player("Jones",15),
                new Player("Jones",20)
        };

        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));
        System.out.println("===========");

        System.out.println(Arrays.toString(players));
        Arrays.sort(players, (o1, o2) -> o2.getScore() - o1.getScore());
        System.out.println(Arrays.toString(players));
        System.out.println("===========");


    }
}
