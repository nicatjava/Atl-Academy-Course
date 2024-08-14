package lesson52;


import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        String word = "AZERBAIJAN";
        Map<Character, Integer> result = new HashMap<>();
        word.chars().mapToObj(c -> (char) c)
                .forEach(ch -> result.put(ch, result.getOrDefault(ch, 0) + 1));
        System.out.println(result);
    }
}
