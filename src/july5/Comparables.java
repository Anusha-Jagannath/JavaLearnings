package july5;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparables {

    public static void main(String args[]) {
        System.out.println("Learning comparables and comparators");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("anusha",1));
        studentList.add(new Student("ami",2));
        studentList.add(new Student("xy",3));
        studentList.add(new Student("mith",14));
        studentList.add(new Student("anusha",10));

        Collections.sort(studentList);
        for (Student s : studentList) {
            System.out.println(s.name+" "+s.age);
        }

        Collections.sort(studentList, new SortByNameThenMarks());
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.name.equals(o2.name)) return o1.age - o2.age;

                return o1.name.compareTo(o2.name);
            }
        });

        Collections.sort(studentList, new SortByNameThenMarks().thenComparing(Student::getName).thenComparing(Student::getAge));
    }
}

class SortByNameThenMarks implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.name.equals(o2.name)) return o1.age - o2.age;

        return o1.name.compareTo(o2.name);
    }
}
