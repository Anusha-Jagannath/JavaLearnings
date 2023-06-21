package condtionalstatements;

public class Main {
    public static void main(String args[]) {
        System.out.println("Learning conditional statements");
        int age = 18;
        if (age > 18) {
            System.out.println("You can vote now");
        }

        int noOfPetals = 8;
        if (noOfPetals % 2 == 0) {
            System.out.println("This is a like");
        } else {
            System.out.println("This is not a like");
        }

        int number = 30;
        if (number <= 10) {
            System.out.println("The number is less than 10");
        } else if (number > 10 && number < 20) {
            System.out.println("The number lies between 10 and 20");
        } else if (number >= 20 && number < 30) {
            System.out.println("The number lies between 20 ad 30");
        } else {
            System.out.println("The number is greater than 30");
        }
    }
}
