package condtionalstatements;

public class Recursion1 {

    public static void main(String args[]) {
        System.out.println("Learning recursion in java");
        System.out.println(countSticks(4));
    }

    private static int countSticks(int n) {
        if (n == 1) return 1;

        return countSticks(n - 1) + 1;
    }
}
