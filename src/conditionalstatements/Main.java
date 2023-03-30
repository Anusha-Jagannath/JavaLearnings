package conditionalstatements;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning conditional statements");
        int number = 45;
        if (number>=1 && number<=100) {
            System.out.println("The number lies between 1 and 100");
        }

        int grade = 11;

        if (grade == 10 || grade == 12){
            System.out.println("You can give board exams");
        } else {
            System.out.println("You cannot give board exams now");
        }
    }
}
