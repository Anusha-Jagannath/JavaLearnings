package july11;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning while and do while loop");
        int number = 12345;
        int temp = number;
        int sum = 0;

//        while (temp != 0) {
//            int remainder = temp % 10;
//            sum = sum + remainder;
//            temp = temp / 10;
//        }

        System.out.println("The sum of number is " + sum);

        int count = (int) Math.log10(number) + 1;
        System.out.println("The count of number is " + count);

        int reverseNumber = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            temp = temp / 10;
        }
        System.out.println(temp == reverseNumber);

        Scanner sc = new Scanner(System.in);
        int n1 = 0;

        do {
            n1 = sc.nextInt();
        } while (n1 < 0);
    }

}
