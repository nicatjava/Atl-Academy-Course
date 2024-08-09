package lesson35;

public class Test1 {
    public static void main(String[] args) {
        int[] myArray = {8,5,7,3,1,12,2};
        bubleSort(myArray);
    }

    public static void bubleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int tempNumber = array[i];
            int tempIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if(tempNumber > array[j]){
                    array[tempIndex] = array[j];
                    array[j] = tempNumber;
                    tempIndex++;
                } else {
                    tempNumber = array[j];
                }
            }
        }
    }
}
