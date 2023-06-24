package june24learn;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning java logical operators");
        int number = 45;
        if (number >= 1 && number <= 100) {
            System.out.println("The number lies between 1 and 100");
        }

        int grade = 11;
        if (grade == 10 | grade == 12) {
            System.out.println("You can give board exams now");
        } else {
            System.out.println("You cannot give board exam now");
        }


        if (!(grade == 10 | grade == 12)) {
            System.out.println("You cannot give board exam now");
        }

        int a = 3;
        int b = 4;
        int c = 5;

        if (a > b) {
            if (a > c) {
                System.out.println("The greater number is " + a);
            } else {
                System.out.println("The greater number is " + c);
            }
        } else {
            if (b > c) {
                System.out.println("The greater number is " + b);
            } else {
                System.out.println("The greater number is " + c);
            }
        }

        int result = a > b ? a : b;
        int max = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println(max);


    }
}
