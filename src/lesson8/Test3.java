package lesson8;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int height = sc.nextInt();
        int result = (weight+height)*2;
        System.out.println(result);
    }
}
