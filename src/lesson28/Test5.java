package lesson28;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Name (for delete): ");
        String name = sc.nextLine();
        ArrayList<String> names = new ArrayList<>();
        names.add("James");
        names.add("Bob");
        names.add("Mary");
        names.add("John");
        names.add("David");

        if(names.contains(name)) {
            names.remove(name);
            System.out.println(name + " Name Removed!");
        } else {
            System.out.println(name + " Not Found!");
        }
    }
}
