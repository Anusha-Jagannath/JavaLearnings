package july9;

public class Pattern6 {

    public static void main(String args[]) {
        int n = 5;
        int count = 1;

        System.out.println("* ");


        for (int i = 2; i <= n-1; i++) {


            System.out.print("* ");

            for (int k=1;k<=i-2;k++) {
                System.out.print(" ");
            }

            System.out.println("* ");

        }

        for (int i=1;i<=n;i++) {
            System.out.print("* ");
        }
    }
}
