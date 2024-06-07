package lesson8;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int count = 0;
        while(number > 0){
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}
