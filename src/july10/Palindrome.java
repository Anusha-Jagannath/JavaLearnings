package july10;

import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]) {
        int number = 131;
        int result = 0;

        int temp = number;
        while (temp != 0) {
            int rem = temp % 10;
            result = result * 10 + rem;
            temp = temp / 10;
        }

        System.out.println(number == result);

        Scanner sc = new Scanner(System.in);
        int n =0;
        do {
            System.out.println("Enter the nmber");
            n = sc.nextInt();
        } while(n < 0);
    }



}
