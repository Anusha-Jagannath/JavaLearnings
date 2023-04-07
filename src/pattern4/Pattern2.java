package pattern4;

public class Pattern2 {

    public static void main(String args[]) {
        System.out.println("Learning patterns");
        int n = 10;
        for(int i=1;i<=10;i++) {

            for(int j=1;j<=n-i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
