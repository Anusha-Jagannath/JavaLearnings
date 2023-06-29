package june29;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{

    String name;
    int marks;


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

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (this.marks > o.marks) return 1;
        else return -1;
    }
}
