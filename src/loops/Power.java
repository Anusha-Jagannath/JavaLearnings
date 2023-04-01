package loops;

import java.util.Scanner;

public class Power {

    public static void main(String args[]) {
        System.out.println("x raised to y");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 1;

        for(int i=0;i<y;i++){
            result = result * x;
        }
        System.out.println(result);
    }
}


