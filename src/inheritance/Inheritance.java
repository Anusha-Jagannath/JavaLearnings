package inheritance;

public class Inheritance {

    public static void main(String args[]) {
        System.out.println("Learning inheritance in java");
        Teacher teacher = new Teacher();
        teacher.name = "teacher1";
        teacher.teach();

        Singer singer = new Singer();
        //singer.name "singer1";
        singer.walk();
        singer.eat();

        Teacher teacher1 = new Teacher();
        Person p = teacher1;
    }
}
