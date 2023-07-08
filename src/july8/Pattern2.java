package july8;

public class Pattern2 {

    public static void main(String args[]) {
        System.out.println("Learning pattern2");
        int n =5;

        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i+1;j++) {
                System.out.print("  ");
            }

            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
