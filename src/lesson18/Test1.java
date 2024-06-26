package lesson18;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Array Size: ");
        int[] myArray = new int[sc.nextInt()];
        for (int i = 0; i < 5; i++) {
            myArray[i] = rand.nextInt(100);
        }
        for (int n : myArray) {
            if(n%2 != 0){
                System.out.println(n);
            }
        }
    }
}
