package pattern2;

public class Pattern4 {

    public static void main(String args[]) {
        System.out.println("Pattern4");

        for(int i=1;i<=10;i++) {
            for(int j=1;j<=10-i+1;j++) {
                System.out.println("* ");
            }
        }
    }
}
