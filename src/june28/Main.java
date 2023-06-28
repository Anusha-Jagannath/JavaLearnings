package june28;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning extra loops");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of a number is " + fact);


        int n1 = 5;
        int f1 = 0;
        int f2 = 1;
        System.out.println(f1);
        System.out.println(f2);

        for (int i = 2; i <= n1; i++) {
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

        System.out.println(result);

    }
}
