package lesson23;

import java.time.LocalDate;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        ld = ld.minusDays(2);
        System.out.println(ld);
    }
}

