package lesson35;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Number> map = new HashMap<>();
        map.put("A", 1);
        map.put("A", 2);
        System.out.println(map.get("A"));
        boolean result = map.remove("A",2);
        System.out.println(map.get("A"));
        System.out.println(result);
    }
}
