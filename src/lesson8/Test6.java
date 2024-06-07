package lesson8;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number == 12 || number >= 1 && number <= 2) {
            System.out.println("Winter");
        } else if (number >= 3 && number <= 5) {
            System.out.println("Spring");
        }  else if (number >= 6 && number <= 8) {
            System.out.println("Summer");
        }  else if (number >= 9 && number <= 11) {
            System.out.println("Autumn");
        }
    }
}
