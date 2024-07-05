package lesson24.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int size = 5;
        char[][] myMatrix = new char[size][size];
        Random rand = new Random();
        int rowIndex = rand.nextInt(size);
        int columnIndex = rand.nextInt(size);

        Scanner sc = new Scanner(System.in);

        int userRow = -1;
        int userColumn = -1;

        System.out.println("All set. Get ready to rumble!");
        initMatrix(myMatrix);
        createAndPrintTable(myMatrix);

        while(!(userRow-1 == rowIndex && userColumn-1 == columnIndex)){
            System.out.print("Enter row (1-5): ");
            userRow = sc.nextInt();
            System.out.print("Enter column(1-5): ");
            userColumn = sc.nextInt();
            if(userRow < 1 || userRow > size || userColumn < 1 || userColumn > size){
                System.out.println("Invalid input. Try again.");
            } else if (userRow-1 == rowIndex && userColumn-1 == columnIndex){
                myMatrix[userRow-1][userColumn-1] = 'X';
                createAndPrintTable(myMatrix);
                System.out.println("You have won!");
            } else {
                myMatrix[userRow-1][userColumn-1] = '*';
                createAndPrintTable(myMatrix);
            }
        }
    }

    public static void initMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], '-');
        }
    }

    public static void createAndPrintTable(char[][] matrix) {
        System.out.println("0 | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
