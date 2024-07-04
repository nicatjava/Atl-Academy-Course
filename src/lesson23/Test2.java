package lesson23;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test2 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy");
        LocalDate date1 = LocalDate.parse("01-01-2023", formatter);
        LocalDate date2 = LocalDate.parse("07-04-2024", formatter);

        Period difference = Period.between(date1, date2);

        System.out.println("Difference: " + difference.getYears() + " year, " +
                difference.getMonths() + " month, " + difference.getDays() + " day");
    }
}
