package exercises.Programmieren1.SelectionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectionSort {
    private static List<Integer> data;

    public static void main(String[] args) {
        data = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            data.add(random.nextInt(100) + 1);
        }
        System.out.println(data);
        sort();
        System.out.println(data);
    }

    private static void sort() {
        for (int i = 0; i < (data.size() - 1); i++) {
            int index = i;
            int j = i + 1;
            while (j < data.size()) {
                if (data.get(j) < data.get(index)) {
                    index = j;
                }
                j++;
            }
            Integer tmp = data.get(index);
            data.set(index, data.get(i));
            data.set(i, tmp);
        }
    }

}
