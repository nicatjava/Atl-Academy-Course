package lesson36;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String,String> phoneBook = new HashMap<>();
        while(true){
            System.out.println("PLease Choose Operation");
            System.out.println("1-ADD");
            System.out.println("2-DELETE");
            System.out.println("3-FIND");
            System.out.println("4-SHOW");
            System.out.println("5-EXIT");
            Scanner sc = new Scanner(System.in);
            int operation = sc.nextInt();
            if(!(operation >=1 && operation <=5)){
                System.out.println("Invalid Operation");
                continue;
            } else{
                switch(operation){
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        System.out.print("Enter Phone: ");
                        String phone = sc.next();
                        addContacnt(phoneBook,name,phone);
                        System.out.println("Contact Added");
                        break;
                    case 2:
                        System.out.print("Enter Name: ");
                        String name2 = sc.next();
                        deleteContactByName(phoneBook,name2);
                        System.out.println("Contact Deleted");
                        break;
                    case 3:
                        System.out.print("Enter Name: ");
                        String name3 = sc.next();
                        String number = findContactByName(phoneBook,name3);
                        System.out.println("Contact Found: "+number);
                        break;
                    case 4:
                        showAllContacts(phoneBook);
                        break;
                    case 5:
                        System.exit(0);
                }
            }
        }
    }
    public static void case1(){

    }
    public static void addContacnt(HashMap<String,String> phoneBook, String name, String number){
        phoneBook.put(name,number);
    }

    public static void deleteContactByName(HashMap<String,String> phoneBook,String name){
        phoneBook.remove(name);
    }

    public static String findContactByName(HashMap<String,String> phoneBook, String name){
        return phoneBook.get(name);
    }

    public static void showAllContacts(HashMap<String, String> phoneBook) {
        System.out.println("All Phone Book:");
        Set<String> keys = phoneBook.keySet();
        for (String key : keys) {
            System.out.println("name: " + key + " number: " + phoneBook.get(key));
        }
    }

}
