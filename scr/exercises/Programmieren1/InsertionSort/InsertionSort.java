package exercises.Programmieren1.InsertionSort;

import java.util.Random;

public class InsertionSort {

    private int counter;
    private int[] data;

    public void main(String[] args) {
        data = new int[999];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100) - 1;
        }
        sort();

    }

    private void sort() {
        for (int a = 1; a < data.length; a++) {
            counter++;
            int b = a;
            int tmp = 0;
            tmp = data[b];
            while (b > 0 && data[b - 1] > tmp) {
                data[b] = data[b - 1];
                b--;
            }
            data[b] = tmp;
            print();
        }
    }

    private void print() {
        System.out.println("Durchlauf: " + counter);
        for (int i = 0; i < data.length; i++) {
            System.out.println("Element " + i + " ist: " + data[i]);
        }
    }
}
