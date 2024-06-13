package lesson13;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String reversedNumber = "";
        int i = number.length() - 1;
        while (i >= 0) {
            reversedNumber += number.charAt(i);
            i--;
        }
        System.out.println(reversedNumber);
    }
}
