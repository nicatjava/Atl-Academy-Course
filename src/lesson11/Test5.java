package lesson11;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x%y == 0){
            System.out.println("Divisible");
        } else {
            System.out.println(x/y+" "+x%y);
        }
    }
}
