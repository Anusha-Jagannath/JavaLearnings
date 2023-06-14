package typecasting2;

import java.util.Scanner;

public class UserInput {

    public static void main(String args[]) {
        System.out.println("Learning user input in java");
        System.out.println("Enter the value of x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        double y = sc.nextDouble();

        System.out.println(x);

        float principal = sc.nextFloat();
        int time = sc.nextInt();
        float rateIfInterest  = sc.nextFloat();
        float simpleInterest = principal*time* rateIfInterest;
    }
}
