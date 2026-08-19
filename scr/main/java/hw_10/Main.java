package hw_10;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        //Task1
        System.out.println("Task 1");
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String afterFormat = data.format(formatter);
        System.out.println(afterFormat);

        //Task2
        System.out.println("Task 2");
        LocalDateTime resultPlus = calculateFutureDateTime(LocalDateTime.of(2026, 10, 20, 21, 3), 3, 5);
        System.out.println(resultPlus);
        LocalDateTime resultMinus = calculateFutureDateTime(LocalDateTime.of(2026, 10, 20, 21, 3), -5, 5);
        System.out.println(resultMinus);

        //Task3
        System.out.println("Task 3");
        System.out.println(isWeekend(LocalDateTime.of(2023, 10, 28, 10, 0)));
        System.out.println(isWeekend(LocalDateTime.of(2023, 10, 30, 10, 0)));

        //Task4
        System.out.println("Task 4");
        System.out.println(formatDateTime(LocalDateTime.of(2023, 10, 25, 14, 30), "dd-MM-yyyy HH:mm"));

        //Task5
        System.out.println("Task 5");
        System.out.println(calculateDifference(
                LocalDateTime.of(2023, 10, 25, 14, 30),
                LocalDateTime.of(2023, 10, 28, 16, 45)
        ));

    }

    public static LocalDateTime calculateFutureDateTime(LocalDateTime dateTime, int days, int hours) {
        LocalDateTime newtime = dateTime.plusDays(days).plusHours(hours);

        return newtime;
    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            return true;
        }

        return false;
    }

    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String afterFormat = dateTime.format(formatter);
        return afterFormat;
    }

    public static String calculateDifference(LocalDateTime start, LocalDateTime end) {
        Duration birthdayDifference = Duration.between(start, end);

        long daysVarian2 = birthdayDifference.toMinutes() / 1440;
        long daysTmp = birthdayDifference.toMinutes() % 1440;
        long hoursVarian2 = daysTmp / 60;
        long minutesVarian2 = daysTmp % 60;

        String Result = daysVarian2 + " Days " + hoursVarian2 + " Hours " + minutesVarian2 + " Minutes";
        System.out.println("Another variant " + Result);

        Duration hours = birthdayDifference.plusDays(-birthdayDifference.toDays());
        Duration minutes = hours.plusHours(-hours.toHours());

        String result = "Different " + birthdayDifference.toDays() + " Days " + hours.toHours() + " Hours " + minutes.toMinutes() + " Minutes";

        return result;
    }
}