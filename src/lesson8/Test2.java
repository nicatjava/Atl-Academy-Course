package lesson8;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int children = sc.nextInt();
        int apple = sc.nextInt();
        int result = apple/children;
        System.out.println(result);
    }
}
