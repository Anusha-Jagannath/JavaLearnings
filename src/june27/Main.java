package june27;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning loops in java");
        int ratings = 1;
        switch (ratings) {
            case 1:
            case 2:
                System.out.println("poor");
                break;

            case 3:
                System.out.println("average");
                break;

            case 4:
                System.out.println("good");
                break;

            case 5:
                System.out.println("going good");
                break;

            default:
                System.out.println("invalid review");
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("Hello world " + i);
        }

        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }

        int sum = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The sum is " + sum);

        int result = n * (n + 1) / 2;
        System.out.println(result);

        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }

        int tableOf = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf + " * " + i + " =" + tableOf * i);
        }

        for (int i = 0; i < 10; ) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i--) {
            System.out.println(i);
        }


        for (int i = 0; ; i++) {
            System.out.println(i);
        }
    }
}
