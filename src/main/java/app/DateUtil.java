package app;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DateUtil {

    public static long daysBetween(String startDate, String endDate) {
        try {
            LocalDate start = LocalDate.parse(startDate);
            LocalDate end = LocalDate.parse(endDate);
            return ChronoUnit.DAYS.between(start, end);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use yyyy-MM-dd");
        }
    }

    public static String today() {
        return LocalDate.now().toString();
    }

    public static boolean isWeekend(String date) {
        try {
            LocalDate d = LocalDate.parse(date);
            DayOfWeek dow = d.getDayOfWeek();
            return dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use yyyy-MM-dd");
        }
    }

    public static String getDayOfWeek(String date) {
        try {
            LocalDate d = LocalDate.parse(date);
            return d.getDayOfWeek().toString(); // e.g., "MONDAY"
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use yyyy-MM-dd");
        }
    }
}