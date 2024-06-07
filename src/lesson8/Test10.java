package lesson8;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(number % 2 == 0 ? "EVEN" : "ODD");
    }
}
