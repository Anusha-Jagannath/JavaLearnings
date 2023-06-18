package operatorsLearn;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning java operators");
        //Arithmetic operators + - / % ++ --
        int a = 23;
        int b = 25;
        int c = a + b;
        System.out.println(c);
        int m = a * b;
        System.out.println(m);

        int d = (a * a) + (2 * a * b) + (b * b);
        System.out.println(d);

        int r = (a + b) * (a + b);
        System.out.println(r);

        System.out.println(2/3);
        System.out.println(2%3);

        int i = b++;
        System.out.println(i+" "+b);

        int h = ++a;
        System.out.println(h+" "+a);

        System.out.println(a&b);
        System.out.println(a|b);

        //comparison operators
        System.out.println(a<b);
        System.out.println(a!=b);
    }
}
