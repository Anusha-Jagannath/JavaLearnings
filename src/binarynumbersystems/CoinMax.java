package binarynumbersystems;

public class CoinMax {

    public static void main(String args[]) {
        System.out.println("Learning coin max problem");
        System.out.println(coinMax(3,4));
    }

    private static int coinMax(int n, int m) {
        if (n == 1 || m == 1) return 1;

        return coinMax(n - 1, m) + coinMax(m - 1, n);
    }
}
