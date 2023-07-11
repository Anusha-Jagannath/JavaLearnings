package july11;

public class Recursion {

    public static void main(String args[]) {
        System.out.println("Learning recursion");
        System.out.println(countSticks(5));
    }

    private static int countSticks(int n) {
        if (n == 1) return 1;
        return countSticks(n - 1) + 1;
    }
}
