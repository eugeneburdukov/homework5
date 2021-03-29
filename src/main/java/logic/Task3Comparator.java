package logic;

import java.util.Comparator;

public class Task3Comparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getOverallRating() == o2.getOverallRating())
            return 0;
        else if (o1.getOverallRating() < o2.getOverallRating())
            return 1;
        else
            return -1;
    }
}
