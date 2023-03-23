package operators;

public class Main {


    public static void main(String args[]) {
        System.out.println("Learning operators");
        //Arithmetic operators
        System.out.println("Learning arithmetic operators");

        int a = 23;
        int b = 45;
        int sum = a + b;
        System.out.println("The sum of two numbers "+sum);

        int mul = a*b;
        System.out.println("The product of two numbers "+mul);

        //(a+b)2

        int result = a*a+2*a*b+b*b;
        System.out.println("The product of two numbers is "+result);

        int result1 = (a+b)*(a+b);
        System.out.println("The product of two numbers is "+result1);

        int quotient = 6/3;
        System.out.println("The quotient is "+quotient);

        int remainder = 6%3;
        System.out.println("The remainder is "+remainder);

        int check = 7;
        int increment = check++;
        System.out.println("The increment is "+increment);
        System.out.println("The check is "+check);

        int check2 = 8;
        int increment2 = ++check2;

        System.out.println("The increment is "+increment2);
        System.out.println("The check is "+check2);


        //Bitwise operator
         int a1 = 5;
         int b2 = 6;
         int c = a1 & b2;
         System.out.println(c);

         //Bitwise or operator
        System.out.println(a1|b2);

        int right = 13;
        System.out.println(right>>1);

        System.out.println(right<<1);

        if (a<b) {
            System.out.println("a is less than b");
        }

        //< <= > >= == !=

        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println( a != b);


    }
}
