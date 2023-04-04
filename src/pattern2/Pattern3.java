package pattern2;

public class Pattern3 {

    public static void main(String args[]) {
        System.out.println("Learning pattern3");
        for(int i=1;i<=10;i++) {
            for(int j=1;j<=i-1;j++) {
                System.out.print("  ");
            }

            for(int k = 1;k<=10-i+1;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
