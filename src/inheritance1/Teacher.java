package inheritance1;

public class Teacher extends Person{

    public Teacher(String name) {
        super(name);
    }
    public void teach() {
        System.out.println("The teacher is teaching");
    }

    public void eat(){
        System.out.print("teacher is "+name+" eating");
    }
}
