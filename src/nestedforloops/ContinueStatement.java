package nestedforloops;

public class ContinueStatement {

    public static void main(String args[]) {

        int n =100;
        for(int i=1;i<=n;i++) {
            if (i >=40 && i<=50)
                continue;
            System.out.println(i);
        }
    }
}
