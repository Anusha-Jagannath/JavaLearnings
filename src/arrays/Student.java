package arrays;

import java.util.Scanner;

public class Student {

    public static void main(String args[]) {
        System.out.println("Learning array problems");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        double marks[] = new double[n];

        System.out.println("Enter the marks for "+n+" students");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        double sum =0 ;
        double average;

        for (int i = 0; i < n; i++) {
            sum = sum + marks[i];
        }

        average = sum / n;
        System.out.print("The average marks is " + average);
    }
}
