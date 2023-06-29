package june29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparables {

    public static void main(String args[]) {
        System.out.println("Learning comparators and comparables");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("anu", 23));
        studentList.add(new Student("asd", 20));
        studentList.add(new Student("abc", 21));
        studentList.add(new Student("aun", 22));
        studentList.add(new Student("ayu", 23));

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.marks == o2.marks) {
                    return o1.name.compareTo(o2.name);
                }
                return o1.marks - o2.marks;
            }
        });

        Collections.sort(studentList, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
        for (Student s : studentList) {
            System.out.println(s.marks + " " + s.name);
        }

    }
}

class SortByNameThenMarks implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.name.equals(o2.name))
            return o1.marks - o2.marks;
        else {
            return o1.name.compareTo(o2.name);
        }
    }
}
