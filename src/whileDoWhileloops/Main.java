package whileDoWhileloops;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning while and do while loop");
        int n = 1234;
        int temp = n;
        int sum =0;
        while (n != 0) {
            int remainder = n%10;
            sum = sum +remainder;
            n = n/10;
        }

        int count = (int) Math.log10(temp) +1;

        System.out.print("The sum of the number is "+sum);
        System.out.print("The count of numbers is "+count);

    }
 }
