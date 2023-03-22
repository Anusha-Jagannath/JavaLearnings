package typecasting;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal");
        int principal = sc.nextInt();

        System.out.println("Enter rate of interest");
        float rateOfInterest = sc.nextFloat();

        System.out.println("Enter the time");
        int time = sc.nextInt();

        float simpleInterest = (principal*rateOfInterest*time)/100;

        System.out.println("the simple interest is "+simpleInterest);
    }
}
