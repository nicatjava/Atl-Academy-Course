package lesson23;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(date);

        System.out.println("Non Formatted: " + date);
        System.out.println("Formatted: " + formattedDate);
    }
}
