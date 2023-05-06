package inheritance3;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning inheritance");
        Teacher t = new Teacher("Mr teacher");
        t.name = "Mr teacher";
        t.teach();
        t.walk();
        t.eat();

        Singer s = new Singer("Mr singer");
        s.name = "Mr singer";
        s.eat();
        s.walk();

        Teacher teacher = new Teacher("Mr singer");
        Person person = teacher;

        //Person person1 = new Person();
        //Teacher teacher1 =(Teacher) person1;
    }
}
