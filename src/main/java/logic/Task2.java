package logic;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    /*Даны 2 коллекции необходимо получить список элементов, которые находятся в 1-й и во второй коллекции.
     * вывести общие элементы*/

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("Hello", "World"));
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("Hello", "Eugene"));

        ArrayList<String> finalList = new ArrayList<>(arrayList1.size() + arrayList2.size());
        finalList.addAll(arrayList1);
        finalList.addAll(arrayList2);

        for (String e : finalList) {
            System.out.print(e + " ");
        }
    }
}
