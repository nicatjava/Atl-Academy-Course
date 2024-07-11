package lesson28;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(2.5);
        list.add(3.5);
        list.add(4.5);
        list.add(5.5);
        list.add(6.5);

        double result = result(list);
        System.out.println("Result: " + result);
    }

    public static Double result(ArrayList<Double> list){
        double sum = 0;
        double result = 0.0;
        for(Double d : list){
            sum += d;
            result = sum / list.size();
        }
        return result;
    }
}
