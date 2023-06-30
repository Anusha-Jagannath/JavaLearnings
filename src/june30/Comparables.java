package june30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparables {

    public static void main(String args[]) {
        System.out.println("Learning comparables");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("anu", 101));
        studentList.add(new Student("anusha", 102));
        studentList.add(new Student("jkl", 99));
        studentList.add(new Student("iop", 98));

        //Collections.sort(studentList, new SortByNameThenMarks());
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.name.equals(o2.name)) {
                    return o1.marks - o2.marks;
                } else {
                    return o1.name.compareTo(o2.name);
                }
            }
        });

        Collections.sort(studentList, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
        for (Student s : studentList) {
            System.out.println(s.name + " " + s.marks);
        }

    }
}

class SortByNameThenMarks implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.name.equals(o2.name)) {
            return o1.marks - o2.marks;
        } else {
            return o1.name.compareTo(o2.name);
        }
    }
}
