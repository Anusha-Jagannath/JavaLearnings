package july7;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning for loops in java");
        int n = 5;

        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
