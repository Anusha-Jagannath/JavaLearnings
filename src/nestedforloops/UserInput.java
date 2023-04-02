package nestedforloops;

import java.util.Scanner;

public class UserInput {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if (n < 0)
                break;
        }
    }
}
