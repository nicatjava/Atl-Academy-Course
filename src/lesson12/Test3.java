package lesson12;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int multiply = 1;
        while (a != 0) {
            multiply *= a%10;
            a /= 10;
        }
        System.out.println(multiply);
    }
}