package exercises.Programmieren1.SampleExam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateManager {

    public static LocalDate getCurrentLocalDate() {
        return LocalDate.now();
    }

    public static LocalTime getCurrentLocalTime() {
        return LocalTime.now();
    }

    public static long calculateDaysBetween(LocalDate birthday) {
        long now = System.currentTimeMillis();
        long lBirthday = birthday.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        return now - lBirthday;
    }

    public static String getWeekDay(LocalDate birthday) {
        return birthday.getDayOfWeek().toString();
    }
}
