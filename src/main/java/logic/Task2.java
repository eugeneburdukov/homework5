package logic;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    /*Даны 2 коллекции необходимо получить список элементов, которые находятся в 1-й и во второй коллекции.*/

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("Hello", "World"));

        System.out.println(arrayList1);
        System.out.println(arrayList2);

        for (Integer e:
             arrayList1) {
            System.out.print(e + " ");
        }

        System.out.println();

        for (String e:
             arrayList2) {
            System.out.print(e + " ");
        }

    }
}
