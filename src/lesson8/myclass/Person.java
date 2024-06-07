package lesson8.myclass;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
        this.phoneNumber = "Unknown";
    }

    public Person(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

}
