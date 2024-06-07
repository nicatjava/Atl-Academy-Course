package lesson8;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number / 100 == number % 10) {
            System.out.println("=");
        } else if (number/100 > number%10) {
            System.out.println(number/100);
        } else{
            System.out.println(number%10);
        }
    }
}
