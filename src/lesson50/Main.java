package lesson50;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String,Integer> fun = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        fun = s -> s.length();
//        int result = fun.apply("hello");
//        System.out.println(result);
//
//        ShowMessage message = new ShowMessage() {
//            @Override
//            public void show(String text) {
//                System.out.println("My Message: " + text);
//            }
//        };
//
//        message.show("I am Developer!");

        ShowMessage message2 = (text, num) -> System.out.println(text+". My number is: "+num);
        message2.show("I am Java Developer",7);

    }

}
