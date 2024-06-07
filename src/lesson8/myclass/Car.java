package lesson8.myclass;

public class Car {
    private String model;  // Model
    private int year;      // İl
    private String color;  // Rəng

    public Car() {
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
    }
    public Car(String make, String model) {
        this.model = model;
        this.year = 0;
        this.color = "Unknown";
    }
    public Car(String make, String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Unknown";
    }
    public Car(String make, String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
