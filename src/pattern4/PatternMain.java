package pattern4;

public class PatternMain {

    public static void main(String args[]) {
        System.out.println("Learning pattern problems");
        int n=10;
        for(int i=1;i<n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
