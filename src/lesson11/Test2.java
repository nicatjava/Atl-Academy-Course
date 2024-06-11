package lesson11;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //23 =>  (2+3)*(2+3)
        System.out.println((x%10+x/10)*(x%10+x/10));

    }
}
