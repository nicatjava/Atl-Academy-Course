package lesson30;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(14);
        numbers.add(3);
        numbers.add(21);
        numbers.add(15);
        numbers.add(9);
        numbers.add(12);
        numbers.add(35);
        numbers.add(19);
    }

    public static int binarySearch(ArrayList<Integer> numbers, int target) {
        Collections.sort(numbers);
        int low = 0;
        int high = numbers.size() - 1;
        int mid = (low +high)/2;
        if(target == numbers.get(mid)) {

        } else if(target < numbers.get(mid)) {
            low = 0;
            high = mid - 1;
            mid = (low +high)/2;
        } else {
            low = mid + 1;
            high = numbers.size() - 1;
            mid = (low +high)/2;
        }
        return 0;

    }
}
