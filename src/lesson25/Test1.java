package lesson25;

import java.time.LocalDate;

public class Test1 {
    public static void main(String[] args) throws CustomNullPointerExeption {
        getDate("Nicat");
        LocalDate ld = LocalDate.now();
        getDate(ld);
        Integer number = null;
        getDate(number);

    }
    public static void getDate(String name) throws CustomNullPointerExeption {
        if (name == null) {
            throw new CustomNullPointerExeption();
        } else {
            System.out.println("Name: "+name);
        }
    }
    public static void getDate(LocalDate date) throws CustomNullPointerExeption {
        if (date == null) {
            throw new CustomNullPointerExeption();
        } else {
            System.out.println("Date: " + date);
        }
    }

    public static void getDate(Integer number) throws CustomNullPointerExeption {
        if (number == null) {
            throw new CustomNullPointerExeption();
        } else {
            System.out.println("Number: " + number);
        }
    }
}
