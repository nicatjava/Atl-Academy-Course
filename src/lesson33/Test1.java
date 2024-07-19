package lesson33;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(10));
        }
        System.out.println("Original: "+numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        int target = 7;
        int resultIndex = binarySearch(numbers,target);
        System.out.println("result index: "+resultIndex);
    }

    public static int binarySearch(ArrayList<Integer> numbers, int target) {

        int startIndex = 0;
        int high = numbers.size() - 1;

        while (startIndex <= high) {
            int mid = (startIndex + high) / 2;
            if (numbers.get(mid) == target) {
                return mid;
            }
            else if (numbers.get(mid) < target) {
                startIndex = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }


}
