package nestedforloops;

public class NestedForLoops {

    public static void main(String args[]) {
        System.out.println("Learning nested for loops");
        for(int i=0;i<5;i++) {
            for (int j=0;j<10;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
