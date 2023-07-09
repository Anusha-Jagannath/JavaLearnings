package july9;

public class Pattern5 {

    public static void main(String args[]) {
        int n = 5;
        int count = 1;

        int rows = 2 * n - 1;

        for (int i = 1; i <= rows; i++) {

            if (i <= n) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {

                for (int k = 1; k <= (rows - i + 1); k++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
