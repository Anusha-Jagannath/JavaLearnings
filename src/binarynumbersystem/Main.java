package binarynumbersystem;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning number systems in java mathematics");
        System.out.println("Learning conditional statements");
        int a = 4;
        int b = 5;
        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than b");
        }

        int age = 18;
        if (age > 18) {
            System.out.println("You can vote now");
        } else {
            System.out.println("You can not vote please go and play");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of petals");
        int noOfPetals = sc.nextInt();

        if (noOfPetals % 2 == 0) {
            System.out.println("He is not good");
        } else {
            System.out.println("He is good");
        }

        int number = 50;
        if (number < 10) {
            System.out.println("Number is less than 10");
        } else if (number > 10 && number < 20) {
            System.out.println("Number is between 10 and 20");
        } else if (number > 20 && number < 30) {
            System.out.println("Number is between 20 and 30");
        } else if (number > 30 && number < 40) {
            System.out.println("Number is between 30 and 40");
        } else {
            System.out.println("Number is grater than 40");
        }


       int result = (a > b)? a: b;
        System.out.println("The max number is "+result);



    }
}
