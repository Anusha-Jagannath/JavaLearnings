package forloops;

import java.util.Scanner;

public class PowerOf {

    public static void main(String args[]) {
        System.out.println("Learning from x raised to power y");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 1;
        for(int i=0;i<y;i++) {
            result = result*x;
        }

        System.out.println("The result is "+result);
    }
}
