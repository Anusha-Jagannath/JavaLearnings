package conditionalstatement;

public class CoinMaxProblem {

    public static void main(String args[]) {
        System.out.println("Learning coin max problem");
        System.out.println(coinMax(3, 4));
    }

    private static int coinMax(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        return coinMax(m - 1, n) + coinMax(n - 1, m);
    }
}
