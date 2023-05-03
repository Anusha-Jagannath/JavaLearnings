package inheritance1;

public class Main {


    public static void main(String args[]) {
        System.out.print("Learning inheritance");
        Teacher t = new Teacher("iop");


        t.teach();
        t.eat();

        Singer s = new Singer("Mr singer");
        s.sing();

        System.out.print(t instanceof Teacher);
        System.out.print(s instanceof Singer);
        System.out.print(t instanceof Person);

    }
}
