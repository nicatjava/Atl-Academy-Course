package lesson24.practice;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int[][] myArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Soldan sağa doldur
                for (int j = 0; j < n; j++) {
                    myArray[i][j] = count++;
                }
            } else {
                // Sağdan sola doldur
                for (int j = n - 1; j >= 0; j--) {
                    myArray[i][j] = count++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
