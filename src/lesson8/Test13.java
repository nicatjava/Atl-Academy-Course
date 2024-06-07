package lesson8;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int count = 0;
        int sum = 0;
        for (String number : numbers) {
            int num = Integer.parseInt(number); // Sətiri ədədə çevirir
            count++; // Ədədlərin sayını artırır
            sum += num; // Ədədlərin cəmini artırır
        }

        // Nəticəni çap edir
        System.out.println(count + " " + sum);
    }
}
