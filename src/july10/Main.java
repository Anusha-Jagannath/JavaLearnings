package july10;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning java basics");
        int number = 12345;
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int rem = temp % 10;
            sum = sum +rem;
            temp = temp /10;
        }

        int count = (int) (Math.log10(number)+1);

        System.out.println("The sum of number is "+sum);
        System.out.println("The count is "+count);
    }
}
