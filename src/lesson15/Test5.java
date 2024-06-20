package lesson15;

public class Test5 {
    public static void main(String[] args) {

    }

    public static String countingSheep(int num) {
        String s = " sheep...";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i+s);
        }
        return sb.toString();
    }
}
