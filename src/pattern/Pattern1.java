package pattern;

public class Pattern1 {

    public static void main(String args[]) {
        System.out.println("Learning pattern1");

        for(int j=1;j<=20;j++) {
            int tableOf = j;
            for(int i=1;i<=10;i++) {
                System.out.print(tableOf*i+" ");
            }
            System.out.println();
        }
    }
}
