package lesson12;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x*x+y*y==z*z){
            System.out.println("YES");
        } else if (x*x+z*z==y*y) {
            System.out.println("YES");
        } else if (y*y+z*z==x*x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
