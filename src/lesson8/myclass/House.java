package lesson8.myclass;

public class House {
    private int numberOfRooms;
    private int size; // in square feet or square meters
    private boolean hasGarage;

    // Default constructor
    public House() {
        this.numberOfRooms = 0;
        this.size = 0;
        this.hasGarage = false;
    }

    // Parameterized constructor to initialize all properties
    public House(int numberOfRooms, int size, boolean hasGarage) {
        this.numberOfRooms = numberOfRooms;
        this.size = size;
        this.hasGarage = hasGarage;
    }

}
