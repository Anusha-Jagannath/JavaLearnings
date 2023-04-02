package forloops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        System.out.println("Fibonacci numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 =0;
        int f2 = 1;
        System.out.println(f1);
        System.out.println(f2);

        for(int i=2;i<n;i++) {
            int f3 = f1+f2;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }
    }
}
