package inheritance3;

public class Teacher extends Person {

    Teacher(String name) {
        super(name);
    }

    public void teach() {
        System.out.println("teacher"+name+ "is teaching");
    }
}
