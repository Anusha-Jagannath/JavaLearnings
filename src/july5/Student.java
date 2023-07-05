package july5;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (this.name.equals(o.name)) return this.age - o.age;

        return this.name.compareTo(o.name);
    }
}
