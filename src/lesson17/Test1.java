package lesson17;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(101);
        Scanner sc = new Scanner(System.in);
        System.out.println(randNumber);

        int n = -1;
        int count = 0;
        int[] myArray = new int[count]; // myArray[0]
        int[] old;
        while (n != randNumber) {
            System.out.println("Please enter a number: ");
            n = sc.nextInt();
            old = myArray;
            myArray = new int[++count];
            for (int i = 0; i < old.length; i++) {
                myArray[i] = old[i];
            }
            myArray[myArray.length - 1] = n;
            if (n == randNumber) {
                break;
            }
            if (n > randNumber) {
                System.out.println("Your number is too big. Please, try again");
            } else {
                System.out.println("Your number is too small. Please, try again.");
            }
        }
        System.out.println("Congratulate! You Find Number!");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
