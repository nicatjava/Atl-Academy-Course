package lesson17;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(101);
        Scanner sc = new Scanner(System.in);
        System.out.println(randNumber);

        int n= -1;
        while (n != randNumber)
        {
            System.out.println("Please enter a number: ");
            n = sc.nextInt();
            if (n == randNumber){ break; }
            if(n>randNumber){
                System.out.println("Your number is too big. Please, try again");
            }else{
                System.out.println("Your number is too small. Please, try again.");
            }
        }
        System.out.println("Congratulate! You Find Number!");
    }
}
