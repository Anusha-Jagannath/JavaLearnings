package whileDoWhileloops;

public class Palindrome {

    public static void main(String args[]) {
        System.out.print("Learning palindrome number");
        int n =121;
        int temp = n;
        int reverse = 0;

        while(n != 0) {
            int remainder = n %10;
            reverse = reverse*10 +remainder;
            n = n/10;
        }

        System.out.print(temp+" "+reverse);
        if (temp == reverse) {
            System.out.print("palindrome");
        } else {
            System.out.print("not palindrome");
        }

    }
}
