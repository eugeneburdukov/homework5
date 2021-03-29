package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    /*Дана коллекция содержащая информацию о студентах (Имя, Фамилия, номер группы, оценка по физике,
    оценка по химии, оценка по английскому)
    необходимо разместить в коллекции элементы в порядке убывания рейтинга студентов.
    ((коэффициент каждой дисциплины 1)
     */

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Eugene", "Parkhomov", "1521a", 100,
                81, 91));
        students.add(new Student("Alex", "Kolodnikov", "2531b", 61,
                89, 61));
        students.add(new Student("Peter", "Andropov", "3111a", 101,
                89, 65));

        for (int i = 0; i < students.size(); i++) {
            students.get(i).setOverallRating(students.get(i).getPhysicsRating() + students.get(i).getChemistryRating() + students.get(i).getEnglishRating());
        }

        System.out.println("Before sort: ");
        for (Student e:
             students) {
            System.out.println(e);
        }

        System.out.println("After sort: ");
        Collections.sort(students, new Task3Comparator());
        for (Student st : students) {
            System.out.println(st);
        }
    }
}
