package methods;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning methods in java");
        int a = 2;
        int b = 3;
        int c = 5;
        int result = maxOf(a, b);
        int result2 = maxOf(a, b, c);
        System.out.println(result);
        sayHi("hi all");
    }

    private static int maxOf(int a, int b) {
//        if (a > b) return a;
//        else return b;
        return a > b ? a : b;
    }

    private static void sayHi(String greet) {
        System.out.println(greet);
    }

    private static int maxOf(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else return c;
    }
}
