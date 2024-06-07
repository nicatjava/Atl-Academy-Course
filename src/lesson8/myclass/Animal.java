package lesson8.myclass;

public class Animal {
    String type;
    int age;
    int weight;

    public Animal(String type, int age, int weight) {
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal(){
        
    }
}
