package nestedforloops;

public class BreakStatement {

    public static void main(String args[]) {
        System.out.println("Learning break statements");

        //print first 100 numbers if number reached is 5 just come out of the loop

        for (int i = 1; i <= 100; i++) {
            if (i == 35) {
                break;
            }

            System.out.println(i);
        }
    }
}
