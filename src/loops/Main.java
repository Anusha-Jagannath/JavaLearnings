package loops;

public class Main {
    public static void main(String args[]) {
        System.out.println("Learning foor loops");

        int ratings = 4;
        switch (ratings) {
            case 1:
            case 2:
                System.out.println("poor");
            break;

            case 3: System.out.println("average");
            break;

            case 4:
            case 5:
                System.out.println("good");
            break;

        }

        for (int i=0;i<10;i++) {
            System.out.println("Hello World "+i);
        }

        for(int i=1;i<=100;i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for(int i = 0;i<=100;i += 2) {
            System.out.println(i);
        }

        //sum of even numbers
        int sum =0;
        for(int i=1;i<=100;i++) {
            if (i % 2 ==0) {
                System.out.println(i);
                sum =sum +i;
            }
        }
        System.out.println(sum);

        for(int i=100;i>0;i--) {
            System.out.println(i);
        }

        int table = 4;
        for(int i=0;i<=100;i++) {
            System.out.println(table*i);
        }

        //infinite loops
        for(int i=0;i<10;i--) {
            System.out.println(i);
        }

        for(;;) {
            System.out.println("hello world");
        }
    }
}

