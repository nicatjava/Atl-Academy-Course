package lesson8;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if(number <= 0){
            System.out.println("Ice");
        } else {
            System.out.println("Water");
        }
    }
}
