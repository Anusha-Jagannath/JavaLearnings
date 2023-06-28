package june28;

public class Series {

    public static void main(String args[]) {
        System.out.println("Learning series sum");
        float n = 5;

        float result = 1;
        for (float i = 1; i <= n; i++) {
            result = result + 1 / n;
        }

        System.out.println("The result is " + result);
    }
}
