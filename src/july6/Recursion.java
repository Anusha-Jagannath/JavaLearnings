package july6;

public class Recursion {

    public static void main(String args[]) {
        int n = 5;
        System.out.println(sumOf(n));
        System.out.println(sum(5));


    }


    private static int sumOf(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    private static int sum(int n) {
        if (n == 1) return 1;
        return sum(n - 1) + n;
    }
}
