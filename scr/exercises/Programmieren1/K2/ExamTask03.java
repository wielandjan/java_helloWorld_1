package exercises.Programmieren1.K2;

import java.util.Random;

public class ExamTask03 {
    private static int counter;
    private static int[] data;

    public static void main(String[] args) {

        Random myRandom = new Random();
        data = new int[1_000_000];

        for (int i = 0; i < data.length; i++) {
            data[i] = myRandom.nextInt(100) + 1;

        }

        insertSort();

    }

    private static void insertSort() {
        int tmp = 0;
        int i = 1;
        while (i < data.length) {
            counter++;
            int j = i;
            tmp = data[j];

            while (j > 0 && data[j - 1] > tmp) {
                data[j] = data[j - 1];
                j--;
            }

            data[j] = tmp;
            print();
            i++;
        }

    }

    private static void print() {
        System.out.println("Duchlauf: " + counter);
        int i = 0;
        while (i < data.length) {
            System.out.println("Ausgabe:" + data[i]);
            i++;
        }
    }
}
