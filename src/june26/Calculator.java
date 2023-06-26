package june26;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        switch (ch) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;

            default:
                System.out.println("Invalid operation");
        }

        System.out.println(result);
    }
}
