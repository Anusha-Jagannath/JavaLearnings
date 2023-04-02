package nestedforloops;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("learning for loops");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float result = 0;

        for (float i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result = result - 1 / i;
            } else {
                result = result + 1 / i;
            }
        }

        System.out.println("The result is " + result);
    }
}
