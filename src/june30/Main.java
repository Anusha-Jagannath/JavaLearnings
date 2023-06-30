package june30;

public class Main {

    public static void main(String args[]) {
        int ratings = 4;
        switch (ratings) {
            case 1:
            case 2: System.out.println("bad");
            break;

            case 3: System.out.println("average");
            break;
            case 4: System.out.println("good");
            break;
            case 5: System.out.println("nice");
            break;
        }
    }
}
