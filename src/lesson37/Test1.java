package lesson37;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "programming");
        StringBuilder sb = new StringBuilder();
        concat(words, sb);
        System.out.println(sb);
    }

    public static void concat(List<String> words, StringBuilder sb){
        for(int i = 0; i < words.size(); i++){

            char upperChar = Character.toUpperCase(words.get(i).charAt(0));
            String tail = words.get(i).substring(1);
            sb.append(upperChar+tail);
            if(i != words.size()-1)
                sb.append("-");
        }
    }
}
