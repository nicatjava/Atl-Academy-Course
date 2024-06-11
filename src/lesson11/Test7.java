package lesson11;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x > y ? (x>z ? (x>n ? x : n):(z>n ? z : n)): (y>z ? (y>n ? y : n):(z>n ? z:n)));
    }
}
