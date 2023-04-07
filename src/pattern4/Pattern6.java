package pattern4;

public class Pattern6 {

    public static void main(String args[]) {
        System.out.println("Learning pattern4");
        int n = 10;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i+2;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
