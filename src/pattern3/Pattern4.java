package pattern3;

public class Pattern4 {

    public static void main(String args[]) {
        System.out.println("Learning pattern4");

        for(int i=1;i<=10;i++) {

            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        for(int j=1;j<=10;j++) {
            for(int k=1;k<=10-j;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        for(int i=1;i<=2*10-1;i++) {

            if (i<=10) {
                for(int j=1;j<=i;j++) {
                    System.out.print("* ");
                }
            } else {
                for(int k=1;k<=2*10-2-i+1;k++) {
                    System.out.print("* ");
                }
            }

            System.out.println();

        }


    }
}
