package lesson11;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 2
        int a = sc.nextInt(); // 3
        int b = sc.nextInt(); // 5

        if (x >= a && x <= b) {
            System.out.println("IN");
        } else {
            System.out.println("OUT");

        }
    }
}
