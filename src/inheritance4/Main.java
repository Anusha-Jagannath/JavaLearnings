package inheritance4;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning inheritance");
        Teacher t = new Teacher("Mr teach");
        t.name = "Mr teach";
        //t.teach();
        t.eat();
        t.walk();

        Singer sing = new Singer("Mr singer");
        //sing.name = "Mr singer";
        sing.sing();
        sing.eat();
        sing.walk();

        //Teacher teacher = new Teacher();
        //Person p = teacher;


        Person p1 = new Person("lop");
        Teacher t1 = (Teacher) p1;

        boolean t2 = t1 instanceof Teacher;
        boolean t3 = p1 instanceof Person;
        System.out.print(t1 instanceof Teacher);
        System.out.print(p1 instanceof Person);
        System.out.print(sing instanceof Singer);


    }
}
