package lesson28;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Name: ");
        String name = sc.nextLine();
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");


        boolean hasName = names.contains(name);
        if(hasName){
            System.out.println(name+" has on list!");
        } else {
            System.out.println(name+" not found on list!");
        }
    }
}
