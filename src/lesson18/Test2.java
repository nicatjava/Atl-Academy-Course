package lesson18;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("=============================================");
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
