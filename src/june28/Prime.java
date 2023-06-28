package june28;

import java.util.Scanner;

public class Prime {

    public static void main(String args[]) {
        System.out.println("Enter the prime number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;

        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
