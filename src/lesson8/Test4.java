package lesson8;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        if(level >= 1 && level <= 3){
            System.out.println("Initial");
        } else if(level >= 4 && level <= 6){
            System.out.println("Average");
        } else if(level >= 7 && level <= 9){
            System.out.println("Sufficient");
        } else if(level >= 10 && level <= 12){
            System.out.println("High");
        }
    }
}
