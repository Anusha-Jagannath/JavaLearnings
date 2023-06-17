package operators2;

public class Recursion {
    public static void main(String args[]) {
        System.out.println("learning recursion in java");
        printName("anuj", 5);
        System.out.println(countSticks(5));
        System.out.println(sum(5));
        System.out.println(sumOf(5));

    }

    private static void printName(String name, int n) {
        if (n == 1) return;

        System.out.println(name);
        printName(name, n - 1);
    }

    private static int countSticks(int n) {
        if (n == 1)
            return 1;
        return countSticks(n - 1) + 1;
    }

    private static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }


    private static int sumOf(int n) {
        if (n ==1 ) return 1;

        return sumOf(n-1) +n;
    }

}
