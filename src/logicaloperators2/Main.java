package logicaloperators2;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning logical operators");
        int number = 45;
        if (number >= 1 && number <= 10) {
            System.out.println("Number is in the range 1 to 10");
        } else if (number >= 10 && number <= 20) {
            System.out.println("Number is in the range 10 to 20");
        }

        int grade = 11;
        if (grade == 10 || grade == 12) {
            System.out.println("You can give bard now");
        } else {
            System.out.println("You cannot give board now");
        }


        int a = 2;
        int b = 3;
        int c = 5;

        if (a > b) {
            if (a > c) {
                System.out.println("The greater number is " + a);
            } else {
                System.out.println("The greater number is " + c);
            }
        } else if (b > c) {
            System.out.println("The greater number is " + b);
        } else {
            System.out.println("The greater number is " + c);
        }


        int result = a > b ? a > c ? a : c : b > c ? b : c;
    }
}
