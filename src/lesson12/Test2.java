package lesson12;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if ((x > y && x < z) || (x < y && x > z)) {
            System.out.println(x);
        } else if ((y > x && y < z) || (y < x && y > z)) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
