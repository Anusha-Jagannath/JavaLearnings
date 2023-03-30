package switch_case;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning switch statements");
        int dayOfWeek = 4;

        if (dayOfWeek == 1) {

        } else if (dayOfWeek == 2) {

        } else if (dayOfWeek == 3) {

        } else if (dayOfWeek == 4) {

        } else if (dayOfWeek == 5) {

        } else if (dayOfWeek ==  6) {

        } else if (dayOfWeek == 7) {

        }

        switch (dayOfWeek) {
            case 1: System.out.println("Monday");
            break;

            case 2: System.out.println("Tuesday");
            break;

            case 3: System.out.println("Wednesday");
            break;


            case 4: System.out.println("Thursady");
            break;

            case 5: System.out.println("Friday");
            break;

            case 6: System.out.println("Satrady");
            break;

            default: System.out.println("Not matching");

        }
    }
}
