package inheritance4;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
        System.out.print("Teacher constructor");
    }

    public void teach() {
        System.out.print("Teacher is teaching");
    }

    public void eat() {
        System.out.println("Teacher"+name+"is eating");
    }
}
