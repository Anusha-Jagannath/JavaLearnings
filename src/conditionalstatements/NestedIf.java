package conditionalstatements;

public class NestedIf {

    public static void main(String args[]) {
        System.out.println("Learning nested if else");

        int a = 4;
        int b = 5;
        int c = 2;

        if (a>b) {
            if (a>c) {
                //print a is greater
                System.out.println(a+" is greater");
            } else {
                //print c is greater
                System.out.println(c+" is greater");
            }
        } else {
            if (b>c) {
                //print b is greater
                System.out.println(b+" is greater");
            } else {
                //print c is greater
                System.out.println(c+" is greater");
            }
        }

        int result = (a>b)? (a>c)? a:c :(b>c)? b:c;
        System.out.println("The largest number is "+result);

    }
}
