package switch_case_learn_new;

public class Main {

    public static void main(String args[]) {
       System.out.println("Learning switch statements");
       int dayOfWeek = 2;
       if (dayOfWeek == 1) {
           System.out.println("daya1");
       } else if (dayOfWeek == 2) {
           System.out.println("day2");
       } else if (dayOfWeek == 3) {
           System.out.println("day3");
       } else if (dayOfWeek == 4) {
           System.out.println("day4");
       }

       switch (dayOfWeek) {
           case 1: System.out.println("day1");


           case 2: System.out.println("day2");
          // break;

           case 3: System.out.println("day3");
           //break;


           default: System.out.println("default case");
       }
    }
}
