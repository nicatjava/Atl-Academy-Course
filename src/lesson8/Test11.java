package lesson8;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number == 0){
            System.out.println(0);
        } else if(number > 0){
            System.out.println(1);
        } else{
            System.out.println(-1);
        }
    }
}
