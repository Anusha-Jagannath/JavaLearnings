package pattern2;

public class Pattern5 {

    public static void main(String args[]) {
        System.out.println("Learning Pattern5");
        for(int i=1;i<=10;i++) {
            for(int j=1;j<=10-i+1;j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
