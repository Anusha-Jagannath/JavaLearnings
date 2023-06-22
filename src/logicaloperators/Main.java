package logicaloperators;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning logical operators");
        int number = 10;
        if (number >= 1 && number <= 20) {
            System.out.println("The number lies between 1 and 20");
        } else if(number >=20 && number <= 30) {
            System.out.println("The number lies between 20 and 30");
        }

        int grade = 11;
        if (!(grade == 10 || grade == 12)) {
            System.out.println("you cannot give board exam now");
        }

        ///find greater of 3 numbers
        int a= 2;
        int b =3;
        int c=4;

        if (a>b) {
            if (a>c) {
                System.out.println("The greater name is "+a);
            } else {
                System.out.println("the greater number is "+c);
            }
        } else if (b>c) {
            System.out.println("The greater number is "+b);
        } else {
            System.out.println("The greater number is "+c);
        }
    }
}
