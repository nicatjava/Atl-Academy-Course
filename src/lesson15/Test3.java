package lesson15;

public class Test3 {
    public static void main(String[] args) {
        String name = "Sam Harris";
        System.out.println(abbrevName(name));
    }

    public static String abbrevName(String name) {
        String[] words = name.split(" ");
        return words[0].toUpperCase().charAt(0)+"."+words[1].toUpperCase().charAt(0);
    }
}
