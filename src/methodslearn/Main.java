package methodslearn;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning methods in java");
        System.out.print(maxOf(2, 3));

    }

    private static int maxOf(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    private static void sayHi() {
        System.out.print("Hello");

    }
}
