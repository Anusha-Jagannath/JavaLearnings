package july8;

public class Recursion {

    public static void main(String args[]) {
        System.out.println("Learning recursion problem");
        System.out.println(powerOf(2,3));
        System.out.println(findPower(2,3));
        System.out.println(fastPower(2,4));
    }


    private static int powerOf(int a, int b) {

        int result =1;

        for (int i=1;i<=b;i++) {
            result = result*a;
        }
        return result;
    }

    private static int findPower(int a,int b) {
        if (b == 0) return 1;

        return findPower(a, b-1) * a;
    }

    private static int fastPower(int a,int b) {

        if (b == 0) return 1;

        if (b % 2 ==0) {

            return fastPower(a*a,b/2);
        }

        return fastPower(a*a,b/2) * a;
    }
}
