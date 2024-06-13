package lesson13;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int firstElement=0;
        int lastElement = x%10;
        while(x>0){
            firstElement = x;
            x = x / 10;
        }
        System.out.println(firstElement+lastElement);
    }
}
