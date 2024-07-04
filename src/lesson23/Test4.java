package lesson23;

import java.time.LocalDate;

public class Test4 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        ld = ld.plusDays(3);
        System.out.println(ld);
    }
}
