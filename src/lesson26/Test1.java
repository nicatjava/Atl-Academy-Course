package lesson26;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws CustomNumberFormatExeption {
        Scanner sc = new Scanner(System.in);
        String getInput = sc.nextLine();
        try{
            Integer.parseInt(getInput);
        } catch (NumberFormatException e){
            throw new CustomNumberFormatExeption();
        }
    }
}