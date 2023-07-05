package july5;

public class Pattern4 {

    public static void main(String args[]) {
        System.out.println("Learning pattern4");

        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }

            for (int k=1;k<=n-i+1;k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
