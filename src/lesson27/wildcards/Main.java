package lesson27.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Jane", 5));
        cats.add(new Cat("Bob", 4));
        printAnimal(cats);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Tom", 5));
        dogs.add(new Dog("Jack", 2));
        printAnimal(dogs);

        System.out.println("=======================================");

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Jane", 5));
        animals.add(new Dog("Bob", 4));
        printCat(animals);
        printAnimal(animals);

        System.out.println("=======================================");
        printCat(cats);
        //printCat(dogs); <--- compile error

    }

    public static void printAnimal(List<? extends Animal> animals){
        for(Animal animal : animals){
            System.out.println("Class Name: "+ animal.getClass().getName() + " Animal Name: " + animal.name);
        }
    }

    public static void printCat(List<? super Cat> animals){
        for(Object animal : animals){
            System.out.println("Class Name: "+ animal.getClass().getName());
        }
    }

}
