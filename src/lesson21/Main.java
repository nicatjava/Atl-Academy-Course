package lesson21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Enum-lar haqqinda
//        Size size = Size.MEDIUM;
//        System.out.println(size.getPrice());
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Operation (+,-,*,/): ");
        char c = sc.next().charAt(0);
        System.out.print("Please Enter First Number: ");
        Double a = sc.nextDouble();
        System.out.print("Please Enter Second Number: ");
        Double b = sc.nextDouble();
        Operation operation = Operation.getOperation(c);
        System.out.println(calculate(a, b, operation));

    }

    public static Double calculate(Double a, Double b, Operation operation) {
        if (operation == Operation.SUM) {
            return a + b;
        } else if (operation == Operation.SUBTRACT) {
            return a - b;
        } else if (operation == Operation.MULTIPLY) {
            return a * b;
        } else if (operation == Operation.DIVIDE) {
            return a / b;
        } else if (operation == Operation.MODULUS) {
            return a % b;
        } else return null;
    }
}
