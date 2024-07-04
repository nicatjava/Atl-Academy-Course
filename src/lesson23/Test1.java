package lesson23;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Test1 {
    public static void main(String[] args) {
        // Vaxt zonasını təyin edin (Bakı)
        ZoneId zoneId = ZoneId.of("Asia/Baku");

        // Cari vaxtı həmin vaxt zonasına görə əldə edin
        ZonedDateTime currentTime = ZonedDateTime.now(zoneId);

        // Vaxtı formatlayın və çap edin
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Cari vaxt (Bakı): " + formattedTime);
    }
}