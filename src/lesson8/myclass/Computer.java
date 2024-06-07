package lesson8.myclass;

public class Computer {
    private String brand;
    private String model;
    private String processor;
    private int ram;
    private int storage;

    public Computer() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.processor = "Unknown";
        this.ram = 0;
        this.storage = 0;
    }

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.processor = "Unknown";
        this.ram = 0;
        this.storage = 0;
    }

    public Computer(String brand, String model, String processor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = 0;
        this.storage = 0;
    }

    public Computer(String brand, String model, String processor, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }
}
