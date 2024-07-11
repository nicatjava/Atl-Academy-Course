package lesson28;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Character> myCharList = new ArrayList<Character>();
        char myChar = 'e';
        while (myChar != 'q') {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter a Character: ");
            myChar = sc.next().charAt(0);
            if (myChar == 'q') {
                break;
            } else {
                System.out.println("Wrong Char: "+myChar);
                myCharList.add(myChar);
            }
        }
        System.out.println("Char Found! It is "+ myChar);
        System.out.println(myCharList);
    }
}
