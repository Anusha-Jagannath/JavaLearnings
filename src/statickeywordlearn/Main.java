package statickeywordlearn;

public class Main {


    static {
        System.out.print("In static block 1");
    }

    static {
        System.out.print("In block 2");
    }

    public static void main(String args[]) {

        System.out.print("Learning static keyword");
        A a = new A();
        A.B b = a.new B();
        A.C c = new A.C();

    }
}
