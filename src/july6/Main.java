package july6;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning nested for loops");
        int n =20;
        for (int i =1;i<=n;i++) {
            int tableOf = i;

            for (int j=1;j<=10;j++) {
                System.out.print(tableOf*j+" ");
            }
            System.out.println();
        }

    }
}
