package july4;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning nested loops in java");
        int n = 9;

        float result = 0;

        for (float i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result = result - 1 / i;
            } else {
                result = result + 1 / i;
            }
        }

        System.out.println("The result is " + result);

        for (int i = 1; i <= 100; i++) {
            if (i == 35) {
                break;
            }

            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n1 = sc.nextInt();
            if (n1 < 0) {
                break;
            }
        }
    }
}
