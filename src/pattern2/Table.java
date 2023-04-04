package pattern2;

public class Table {

    public static void main(String args[]) {
        System.out.println("Learning nested for loops");
        for(int i=1;i<20;i++) {
            int tableOf = i;
            for(int j=1;j<10;j++) {
                System.out.print(tableOf*j+" ");
            }
            System.out.println();
        }
    }
}
