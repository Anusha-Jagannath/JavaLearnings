package operators2;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning java operators");
        int a = 23;
        int b = 25;
        int c = a + b;
        System.out.println(c);
        int s = (a * a) + (2 * a * b) + (b * b);
        System.out.println(s);
        int s1 = (a + b) * (a + b);

        System.out.println(s1);

        double d = (double) b / a;
        System.out.println(d);

        int c1 = b++;
        System.out.println(c1);
        System.out.println(b);

        int e1 = ++b;
        System.out.println(e1);
        System.out.println(b);

        int c3 = a >> 2;
        System.out.println(a < b);


    }
}
