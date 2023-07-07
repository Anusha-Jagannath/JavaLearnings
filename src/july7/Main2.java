package july7;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {

    public static void main(String args[]) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("anusha", 23));
        studentArrayList.add(new Student("amii", 24));
        studentArrayList.add(new Student("jkl", 4));

        Collections.sort(studentArrayList);

        for (Student s : studentArrayList) {
            System.out.println(s.name + " " + s.marks);
        }

        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.name.equals(o2.name)) return o1.marks - o2.marks;
                return o1.name.compareTo(o2.name);
            }
        });

        //Collections.sort(studentArrayList, new Comparator().thenComparing(Student::getName).thenComparing(Student::getMarks).reversed());
    }
}

class SortByNameThenMarks implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.name.equals(o2.name)) return o1.marks - o2.marks;
        return o1.name.compareTo(o2.name);
    }
}
