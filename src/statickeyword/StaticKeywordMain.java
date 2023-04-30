package statickeyword;

public class StaticKeywordMain {


    static {
        System.out.print("In static block");
    }

    static {
        System.out.print("In static block new");
    }

    public static void main(String args[]) {
        System.out.println("Learning static keyword");
        A a = new A();
        A.B b = a.new B();

        A.C c = new A.C();
    }
}

class Person {
    String name;
    int age;
    static String breed = "Homo sapiens";


}
