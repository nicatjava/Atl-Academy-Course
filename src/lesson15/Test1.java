package lesson15;

public class Test1 {
    public static void main(String[] args) {
        String s =  "Hello! This is a test string with exclamation marks!!";
    }
    private static String removeExclamationMarks(String s) {
        s = s.replace("!", "");
        return s;
    }
}
