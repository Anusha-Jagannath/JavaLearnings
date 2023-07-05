package july5;

public class Recursion {

    public static void main(String args[]) {
        System.out.println("Learning recursion1");
        printName(5);
        System.out.println(countSticks(5));
    }

    private static void printName(int n) {
        if (n == 0) {
            return;
        }

        printName(n - 1);
        System.out.println("Hello");
    }

    private static int countSticks(int n) {
        if (n == 1) return 1;

        return countSticks(n - 1) + 1;
    }
}
