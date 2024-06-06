package lesson8;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int remainder = number % 10;
        number = number / 10;
        System.out.println(number + " " + remainder);
    }
}
