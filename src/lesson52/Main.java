package lesson52;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Food> foods = new ArrayList<>();
        Food food1 = new Food("Pizza",5.0,2,false,true);
        Food food2 = new Food("Hot Dog",3.5,1,false,true);
        Food food3 = new Food("Hem",7.5,5,true,true);
        Food food4 = new Food("IceCream",2.5,3,false,false);
        Food food5 = new Food("Cake",4.0,4,false,false);
        foods.add(food1);
        foods.add(food2);
        foods.add(food3);
        foods.add(food4);
        foods.add(food5);

        List<Food> highCaloriesFoods = highCaloriesFoods(foods);
        System.out.println(highCaloriesFoods);

        List<Food> highPriceFoods = highPriceFoods(foods);
        System.out.println(highPriceFoods);

        List<Food> isMeatyOrFatyFoods = isMeatyOrFatyFoods(foods);
        System.out.println(isMeatyOrFatyFoods);

        List<Food> lessCaloriesFoods = lessCaloriesFoods(foods);
        System.out.println(lessCaloriesFoods);

    }

    public  static List<Food> highCaloriesFoods (List<Food> foods){
        return foods.stream()
                .sorted(Comparator.comparingInt(Food::getCalories)
                .reversed()).toList();
    }

    public  static List<Food> highPriceFoods (List<Food> foods){
        return foods.stream().
                filter(food -> food.getPrice() >= 3).toList();
    }

    public  static List<Food> isMeatyOrFatyFoods (List<Food> foods){
        return foods.stream().
                filter(food -> food.istMeaty() || food.isFatty())
                .toList();
    }

    public  static List<Food> lessCaloriesFoods (List<Food> foods){
        return foods.stream()
                .filter(food -> food.getCalories() < 3)
                .toList();
    }
}
