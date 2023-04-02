package forloops;

import java.util.Scanner;

public class FactorialMain {

    public static void main(String args[]) {
        System.out.println("Factorial of a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for(int i =1;i<=n;i++) {
            fact =fact *i;
        }

        System.out.println("The factorial of a number is "+fact);
    }
}
