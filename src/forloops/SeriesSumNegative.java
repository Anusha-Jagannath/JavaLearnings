package forloops;

import java.util.Scanner;

public class SeriesSumNegative {

    public static void main(String args[]) {
        System.out.println("Learning for loops");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        float result = 0;
        for(float i=1;i<=n;i++) {
            if (n % 2 ==0) {
                //subtract
               result = result - 1/i;

            } else {
                //add
                result = result + 1/i;
            }
        }

        System.out.println("The result is "+result);
    }
}
