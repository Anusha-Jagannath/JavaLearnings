package june26;

public class Main {
    public static void main(String args[]) {
        System.out.println("Learning switch cases in java");
        int dayOfWeek = 4;
        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");
        }


        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("No don't ");
                break;
        }


    }
}
