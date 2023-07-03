package july3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparables {

    public static void main(String args[]) {
        System.out.println("Learning comparables in java");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("anusha", 23));
        studentList.add(new Student("anuj", 24));
        studentList.add(new Student("amithy", 20));
        studentList.add(new Student("amithy", 23));

        for (Student s : studentList) {
            System.out.println(s.name + " " + s.age);
        }

        Collections.sort(studentList);
        for (Student s : studentList) {
            System.out.println(s.name + " " + s.age);
        }

        Collections.sort(studentList, new SortByNameThenAge());

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.name.equals(o2.name)) return o1.age - o2.age;

                return o1.name.compareTo(o2.name);
            }
        });

       Collections.sort(studentList, new SortByNameThenAge().thenComparing(Student::getName).thenComparing(Student::getAge).reversed());


    }
}

class SortByNameThenAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.name.equals(o2.name))
            return o1.age - o2.age;

        return o1.name.compareTo(o2.name);
    }
}
