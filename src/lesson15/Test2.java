package lesson15;

public class Test2 {
    public static void main(String[] args) {
        String s = "word";
        System.out.println(reverse(s));
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
