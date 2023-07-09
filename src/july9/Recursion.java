package july9;

public class Recursion {

    public static void main(String args[]) {
        System.out.println("Learning recursion");
        printName(5);
        System.out.println(count(5));
        System.out.println(sumOf(5));
        System.out.println(powerOf(2, 3));
        System.out.println(fastPower(2, 4));
        System.out.println(fastPower(2, 3));
    }

    private static void printName(int n) {
        if (n == 1) return;

        System.out.println("Hello");
        printName(n - 1);
    }

    private static int count(int n) {
        if (n == 1) return 1;

        return count(n - 1) + 1;
    }

    private static int sumOf(int n) {
        if (n == 1) return 1;

        return sumOf(n - 1) + n;
    }

    private static int powerOf(int a, int b) {
        if (b == 0) return 1;

        return powerOf(a, b - 1) * a;
    }


    private static int fastPower(int a, int b) {
        if (b == 0) return 1;

        if (b % 2 == 0) {
            return fastPower(a * a, b / 2);
        } else {
            return fastPower(a * a, b / 2) * a;
        }
    }


    private static int gridProblem(int n, int m) {

        if (n == 1 || m == 1) return 1;

       return gridProblem(n-1,m)+ gridProblem(n,m-1);
    }
}
