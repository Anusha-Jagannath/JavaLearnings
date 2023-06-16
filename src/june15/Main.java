package june15;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning type casting");
        byte x = 4;
        int y = x;

        System.out.println(y);
        double d = y;
        System.out.println(d);

        int myInt = (int) d;
        double myDouble = 2.8;
        int u = (int) myDouble;
        System.out.println(u);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal");
        int principal = sc.nextInt();

        System.out.println("Enter the time");
        int time = sc.nextInt();

        System.out.println("Enter the rate of interest");
        int rateOfInterest = sc.nextInt();


        int simpleInterest = principal*time*rateOfInterest;
        System.out.println("The simple interest"+simpleInterest);

        String text = sc.nextLine();



    }
}
