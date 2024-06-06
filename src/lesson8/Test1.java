package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Number (10-99): ");
        int number = sc.nextInt();
        if (number >= 10 && number <= 99) {
            int remainder = number % 10;
            number = number / 10;
            System.out.println(number + " " + remainder);
        } else {
            System.out.println("Invalid Number (not betwen 10 and 99)");
        }
    }
}
