package lesson15;

public class Test4 {
    public static void main(String[] args) {

    }

    public static String fakeBin(String numberString) {
        StringBuilder newNumber = new StringBuilder();
        int size = numberString.length();
        for (int i = 0; i < size; i++) {
            int number = Character.getNumericValue(numberString.charAt(i));
            if (number >= 5) {
                newNumber.append('1');
            } else {
                newNumber.append('0');
            }
        }
        return newNumber.toString();
    }
}
