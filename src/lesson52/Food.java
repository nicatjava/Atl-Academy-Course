package lesson52;

public class Food {
    private String name;
    private Double price;
    private Integer calories;
    private Boolean isFatty;
    private Boolean isMeat;

    public Food(String name, Double price, Integer calories, Boolean isFatty, Boolean isMeat) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.isFatty = isFatty;
        this.isMeat = isMeat;
    }

    public Boolean istMeaty() {
        return isMeat;
    }

    public Boolean isFatty() {
        return isFatty;
    }

    public Integer getCalories() {
        return calories;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", isFatty=" + isFatty +
                ", isMeat=" + isMeat +
                '}';
    }
}
