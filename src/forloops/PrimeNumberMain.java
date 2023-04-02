package forloops;

import java.util.Scanner;

public class PrimeNumberMain {

    public static void main(String args[]) {
        System.out.println("Learning prime number or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        }

        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);

    }
}
