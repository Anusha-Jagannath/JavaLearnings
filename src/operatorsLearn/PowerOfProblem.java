package operatorsLearn;

public class PowerOfProblem {

    public static void main(String args[]) {
        System.out.println("Learning power of problem");
        System.out.println(power(2, 3));
        System.out.println(powerOf(2, 3));
        System.out.println(fastPower(2,3));
        System.out.println(fastPower(2,4));
    }


    private static int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * x;
        }
        return result;
    }

    private static int powerOf(int x, int y) {
        if (y == 0) return 1;

        return powerOf(x, y - 1) * x;
    }

    private static int fastPower(int x, int y) {
        if (y == 0)
            return 1;

        if (y % 2==0) {
            return fastPower(x*x, y/2);
        } else {
            return fastPower(x*x,y/2)*x;
        }
    }

}
