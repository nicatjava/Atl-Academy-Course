package lesson11;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day >= 1 && day <= 3) {
            System.out.println("First");
        } else if (day >= 4 && day <= 6) {
            System.out.println("Second");
        } else if (day >= 7 && day <= 9) {
            System.out.println("Third");
        } else if (day >= 10 && day <= 12) {
            System.out.println("Fourth");
        }
    }
}
