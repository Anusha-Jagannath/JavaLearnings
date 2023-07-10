package july10;

public class Main2 {

    public static void main(String args[]) {
        System.out.println("Learning recursion problem");
        printName(5);
    }

    private static void printName(int n) {
        if (n == 0) return;

        printName(n - 1);
        System.out.println("Hello");
    }
}
