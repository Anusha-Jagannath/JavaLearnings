package pattern3;

public class PatternMain {

    public static void main(String args[]) {
        System.out.println("learning pattern1");

        for (int i = 1; i <= 10; i++) {

            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i=1;i<=10;i++) {
            for(int j=1;j<10-i+1;j++) {
                System.out.print("  ");
            }

            for(int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
