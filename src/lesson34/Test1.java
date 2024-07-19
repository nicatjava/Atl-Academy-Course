package lesson34;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Jack");
        names.add("Mary");

        String target = "Jack";
        if(names.contains(target)){
            names.remove(target);
        }

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<String> names2 = new HashSet<>();
        names2.add("Crazy");
        names2.add("Jane");
        names2.add("Crack");
        names2.add("Jack");
        names2.add("Pedro");

        HashSet<String> names3 = new HashSet<>();
        names3.addAll(names);
        names3.addAll(names2);

        HashSet<String> names4 = new HashSet<>();
        names.retainAll(names2);
        System.out.println(names);
        names4.addAll(names);



    }
}
