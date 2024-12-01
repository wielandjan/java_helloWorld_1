package exercises.Programmieren1.SampleExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExamTask02 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scr/exercises/Programmieren1/SampleExam/data.txt");
        Scanner fileScanner = new Scanner(file);
        Scanner consoleScanner = new Scanner(System.in);

        DataProcessor dataProcessor = new DataProcessor();

        while (fileScanner.hasNextLine()) {
            String lineContent = fileScanner.nextLine();
            String[] cells = lineContent.split(";");
            Person person = new Person(cells[0], Integer.valueOf(cells[1]), cells[2]);
            dataProcessor.addPerson(person);
        }
        fileScanner.close();

        System.out.print("Geben Sie einen Namen ein: ");
        System.out.println(dataProcessor.findPersonByName(consoleScanner.nextLine()));

        consoleScanner.close();
        ;
    }
}
