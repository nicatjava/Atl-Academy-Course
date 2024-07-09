package lesson26;

public class Test3 {
    public static void main(String[] args) {

    }

    public static String smash(String... words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.equals(words[words.length - 1])) {
                sb.append(word);
            } else{
                sb.append(word+" ");
            }
        }
        return sb.toString();
    }
}
