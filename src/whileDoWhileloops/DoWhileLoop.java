package whileDoWhileloops;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String args[]) {
        int n = 0;

        do {
            System.out.print("hello world");
        } while (n != 0);


        Scanner sc = new Scanner(System.in);
        int n1 =1;
        while (n1 >0) {
            n1 = sc.nextInt();
            System.out.println(n1);
        }


    }
}
