package july3;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning nested for loops");

        int n = 5;
        float result = 0;

        for (float i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result = result - 1 / i;

            } else {
                result = result + 1 / i;
            }
        }

        System.out.println("The result is " + result);


        int number = 100;

        for (int i = 1; i <= 100; i++) {
            if (i == 35) break;
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Enter the number");
            int n1 = sc.nextInt();
            if (n1 < 0) {
                break;
            }
        }


        for (int i = 0; i <= 100; i++) {
            if (i == 30) {
                continue;
            }

            System.out.println(i);
        }


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
