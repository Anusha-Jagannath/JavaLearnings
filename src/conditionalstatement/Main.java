package conditionalstatement;

public class Main {
    public static void main(String args[]) {
        System.out.println("Learning conditional statements");
        int age = 18;
        if (age >= 18) {
            System.out.println("You can vote now");
        }

        int noOfPetals = 10;
        if (noOfPetals % 2 == 0) {
            System.out.println("This is a like");
        } else {
            System.out.println("this is not like");
        }

        int number = 23;
        if (number <= 10) {
            System.out.println("The number is less than 10");
        } else if (number > 10 && number <= 20) {
            System.out.println("The number lies between 10 and 20");
        } else if (number > 20 && number <= 30) {
            System.out.println("The number lies between 20 and 30");
        } else {
            System.out.println("The number is greater than 30");
        }

        int a = 23;
        int b = 24;
        int result = a > b ? a: b;
        System.out.println(result);

        int a1 = 10;
        int b1 = 20;
        int c1 = 30;

        int result1 = a1 > b1? a1 > c1 ? a1 : c1 : b1 > c1 ? b1: c1;
        System.out.println(result1);

    }
}
