package lesson13;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int multiply = 1;
        int sum = 0;
        while (a > 0) {
            multiply *= a%10;
            sum += a%10;
            a /= 10;
        }
        double result = (double) multiply / sum;
        System.out.printf("%.3f\n", result);
    }
}
