package datatypes3;

public class Recursion {

    public static void main(String args[]) {
        System.out.println("Learning java recursion");
        int n=5;
        System.out.println(sumOf(n));
    }

    private static int sumOf(int n) {
        if (n == 1) return 1;
        return sumOf(n-1) + n;
    }
}
