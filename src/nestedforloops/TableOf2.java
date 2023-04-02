package nestedforloops;

public class TableOf2 {

    public static void main(String args[]) {
        System.out.println("Learning nested for loops");
        for(int j =2;j<=20;j++) {
            int tableOf = j;
            for(int i=1;i<=10;i++) {
                System.out.print(i*tableOf+" ");
            }
            System.out.println();
        }
    }
}
