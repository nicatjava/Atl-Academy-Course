package lesson12;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x==y && x==z){
            System.out.println(1);
        } else if(x==y || x==z || y==z){
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
