package forloops;

import java.util.Scanner;

public class SeriesSum {

    public static void main(String args[]) {
        System.out.println("Learning series sum");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        float result =0;

        for(float i=1;i<=n;i++) {
            result = result+1/i;
        }

        System.out.println("The result is "+result);
    }
}
