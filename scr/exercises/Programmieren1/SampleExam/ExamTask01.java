package exercises.Programmieren1.SampleExam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamTask01 {
    private static LocalDate birthday;

    public static void main(String[] args) {
        System.out.println("Aktuelles Datum: " + DateManager.getCurrentLocalDate());
        System.out.println("Aktuellee Uhrzeit: " + DateManager.getCurrentLocalTime());

        System.out.print("Geben Sie ihr Geburtsdatum ein (yyyy-MM-dd): ");

        Scanner scanner = new Scanner(System.in);
        String birthdayDate = scanner.nextLine();

        int year = Integer.valueOf(birthdayDate.split("-")[0]);
        int month = Integer.valueOf(birthdayDate.split("-")[1]);
        int day = Integer.valueOf(birthdayDate.split("-")[2]);

        birthday = LocalDate.of(year, month, day);

        System.out.println("Sie sind an einem " + DateManager.getWeekDay(birthday) + " geboren.");
        System.out.println("Sie sind ca. " + DateManager.calculateDaysBetween(birthday) + " ms alt.");

    }
}
