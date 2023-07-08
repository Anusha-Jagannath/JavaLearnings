package july8;

public class Pattern5 {

    public static void main(String args[]) {
        System.out.println("Learning pattern3");

        int n = 5;
        int rows = 2 * n - 1;

        for (int i = 1; i <= rows; i++) {

            if (i <= n) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
            } else {

                for (int k = 1; k <= rows - i + 1; k++) {
                    System.out.print("* ");
                }
            }

            System.out.println();


        }
    }
}
