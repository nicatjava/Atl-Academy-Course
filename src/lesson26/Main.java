package lesson26;

public class Main {
    //sual cavab oldu
    //design pattern-lere baxmaq : https://refactoring.guru/design-patterns
    //Generics-ler haqqinda danisildi
    public static void main(String[] args) {
        Box<String> word = new Box<>("Hello");
        System.out.println(word.getT());
    }
}
