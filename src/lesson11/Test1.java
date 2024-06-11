package lesson11;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= x; i++) {
            sum+= i*i;
        }
        System.out.println(sum);
    }
}
