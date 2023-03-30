package switch_case_learn_new;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        char operation = sc1.nextLine().charAt(0);
        int result = 0;

        switch (operation) {
            case '+' : result = a + b;
            case '-' : result = a-b;
            case '*': result = a*b;
            case '/': result = a/b;
        }

        System.out.println(result);
    }
}
