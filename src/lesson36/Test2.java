package lesson36;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();
        String line = "AZERBAIJAN";
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            int count = charCount(line,c);
            hm.put(c,count);
        }
        System.out.println(hm);
    }

    public static int charCount(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
