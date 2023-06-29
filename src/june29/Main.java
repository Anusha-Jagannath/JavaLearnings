package june29;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("learning loops in java");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of number is " + fact);

        int n1 = 10;
        int f1 = 0;
        int f2 = 1;

        System.out.println(f1);
        System.out.println(f2);

        for (int i = 2; i < n1; i++) {
            int f3 = f1 + f2;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }

        int x = 2;
        int y = 6;
        int result = 1;

        for (int i = 1; i <= y; i++) {
            result = result * 2;
        }
        System.out.println("The result is " + result);

        int number = 1;
        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The number is " + isPrime);
        } else {
            System.out.println("The number is not prime");
        }


        float series = 5;
        float resultSeries = 0;

        for (float i = 1; i < series; i++) {
            resultSeries = resultSeries + 1 / i;
        }
        System.out.println("The result is " + resultSeries);
    }
}
