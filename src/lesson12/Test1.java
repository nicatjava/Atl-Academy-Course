package lesson12;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        do{
            count ++;
            a /= 10;
        }
        while (a>0);
        System.out.println(count);
    }
}
