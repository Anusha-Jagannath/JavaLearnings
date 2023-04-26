package accessspecifier;

public class Main {

    public static void main(String args[]) {
        System.out.print("Learning encapsulation in java");
        Student student = new Student("tom");
        Teacher teacher = new Teacher("iop");

        student.name = "klio";

        System.out.print(student.name);
        System.out.print(student.getName());

    }
}
