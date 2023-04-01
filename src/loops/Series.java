package loops;

public class Series {

    public static void main(String args[]) {
        float n =5;
        float result = 0;
        for(float i=1;i<=n;i++) {
            if (n % i == 0) {
                result += 1/n;
            } else {
                result -= 1/n;
            }
        }

        System.out.println(result);
    }
}
