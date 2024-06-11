package lesson11;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x == 0) {
            System.out.println("Zero");
        } else if (x>0) {
            System.out.println("Positive");
        } else{
            System.out.println("Negative");
        }
    }
}
