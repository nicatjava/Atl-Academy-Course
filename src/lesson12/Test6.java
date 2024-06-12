package lesson12;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x>0 && y>0){
            System.out.println(1);
        } else if (x<0 && y>0){
            System.out.println(2);
        } else if (x<0 && y<0){
            System.out.println(3);
        } else if (x>0 && y<0){
            System.out.println(4);
        } else {
            System.out.println(0);
        }
    }
}
