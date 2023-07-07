package july7;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{

    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (this.name.equals(o.name)) return this.marks - o.marks;

        return this.name.compareTo(o.name);
    }
}
