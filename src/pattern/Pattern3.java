package pattern;

public class Pattern3 {

    public static void main(String args[]) {
        System.out.println("Learning patterns");
        for(int i=1;i<=10;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
