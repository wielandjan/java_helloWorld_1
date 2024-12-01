package exercises.Programmieren1.SampleExam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateManager {
    public LocalDate getCurrentLocalDate() {
        return LocalDate.now();
    }

    public LocalTime getCurrentLocalTime() {
        return LocalTime.now();
    }

    public long calculateDaysBetween(LocalDate birthday) {
        long now = System.currentTimeMillis();
        long lBirthday = birthday.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        return now - lBirthday;
    }
}
