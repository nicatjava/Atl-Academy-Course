package lesson22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DateTim haqqinda danisildi
        Scanner scanner = new Scanner(System.in);
        System.out.print("24 saatlıq vaxt daxil edin (HH:mm formatında): ");
        String inputTime = scanner.nextLine();

        String[] timeArray = inputTime.split(":");

        try {
            int hours = Integer.parseInt(timeArray[0]);
            int minutes = Integer.parseInt(timeArray[1]);

            if (hours < 0 || hours >= 24 || minutes < 0 || minutes >= 60) {
                System.out.println("Xəta: Daxil edilən vaxt yanlışdır.");
            } else {
                String period;
                if (hours >= 12) {
                    period = "PM";
                    if (hours > 12) hours -= 12;
                } else {
                    period = "AM";
                    if (hours == 0) hours = 12;
                }

                System.out.printf("%02d:%02d %s\n", hours, minutes, period);
            }
        } catch (NumberFormatException e) {
            System.out.println("Xəta: Daxil edilən format yanlışdır.");
        }
        scanner.close();
}
}