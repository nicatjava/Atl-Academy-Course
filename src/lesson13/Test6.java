package lesson13;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            myFunction(a);
        }

    }

    private static void myFunction(double n){
        double result = n*n*n + 2*n*n - 3;
        System.out.printf("%.4f%n",result);
    }
}
