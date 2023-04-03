package pattern;

public class Pattern4 {

    public static void main(String args[]) {
        System.out.println("Learning pattern4");
        int n =10;
        for(int i=1;i<=n;i++) {
            for(int j =1;j<=n-i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
