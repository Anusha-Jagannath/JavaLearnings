package july6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparables {

    public static void main(String args[]) {
        System.out.println("Learning comparables in java");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("anusha", 20));
        studentList.add(new Student("amy", 32));
        studentList.add(new Student("jkl", 7));

        //Collections.sort(studentList);
        Collections.sort(studentList, new SortByNameThenMarks() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.name.equals(o2.name)) return o1.age - o2.age;
                return o1.name.compareTo(o2.name);
            }
        });

       // Collections.sort(studentList, new SortByNameThenMarks().thenComparing(Student::getName).thenComparing(Student::getAge).reversed());

        for (Student s : studentList) {
            System.out.println(s.name + " " + s.age);
        }
    }
}


class SortByNameThenMarks implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.name.equals(o2.name)) return o1.age - o2.age;

        return o1.name.compareTo(o2.name);
    }
}
