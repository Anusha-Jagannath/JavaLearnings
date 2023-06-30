package june30;

public class Loops {

    public static void main(String args[]) {
        System.out.println("Learning loops in java");
        int number = 5;

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("the factorial of number is " + fact);

        int n = 8;
        int f1 = 0;
        int f2 = 1;
        System.out.println(f1);
        System.out.println(f2);

        for (int i = 2; i < n; i++) {
            int f3 = f1 + f2;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }

        int a = 2;
        int b = 3;
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        System.out.println("The result is " + result);


        int number1 = 40;
        boolean isprime = false;

        if (number1 < 2)
            isprime = false;
        for (int i = 2; i < Math.sqrt(number1); i++) {
            if (number1 % i == 0) {
                isprime = false;
            }
        }

        System.out.println(isprime);

        float number4 = 6;


        int result4 = 0;

        for (int i = 1; i <= number4; i++) {
            result4 = result4 * 1 / i;
        }
        System.out.println(result4);

    }
}
