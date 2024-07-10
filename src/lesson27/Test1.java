package lesson27;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        Box<Integer> box = generateBoxGenerics();
        boolean isEven = box.getValue();
        System.out.println(box);
    }

    public static Box<Integer> generateBoxGenerics(){
        Random rand = new Random();
        int number = rand.nextInt(100);
        boolean isEven = number % 2 == 0;

        return new Box<>(number, isEven);
    }
}
