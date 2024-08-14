package lesson51;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Jack");


        String result = names.stream().collect(Collectors.joining());
        System.out.println(result);


    }
}
