package lesson8;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[][] matrix = new int[number][number];
        int num = 1;

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                // Sətir təkdirsə soldan sağa
                for (int j = 0; j < number; j++) {
                    matrix[i][j] = num++;
                }
            } else {
                // Sətir cütdürsə sağdan sola
                for (int j = number - 1; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }

        // Matrisin çapı
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
