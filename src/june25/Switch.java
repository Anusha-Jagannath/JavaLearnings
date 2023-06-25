package june25;

public class Switch {

    public static void main(String args[]) {
        System.out.println("Learning switch case statements");
        int dayOfWeek = 5;
        if (dayOfWeek == 1) {
            System.out.println("monday");
        } else if (dayOfWeek == 2) {
            System.out.println("tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("friday");
        } else if (dayOfWeek == 6) {
            System.out.println("saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("I don't know what day is");
        }


        switch (dayOfWeek) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
            case 5:
                System.out.println("thursday");
                break;
        }

        System.out.println(dayOfWeek);
    }
}
