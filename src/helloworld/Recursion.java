package helloworld;

public class Recursion {

    public static void main(String args[]) {
        System.out.println("learning sum problem using recursion");
        int a[] = {1,2,3,4,5};
        int n= a.length;
        System.out.println(sumOf(a,n));
        System.out.println(sumOfUsingRecursion(n));

    }

    private static int sumOf(int a[], int n) {
        int sum =0;
        for (int i=1;i<=n;i++) {
            sum =sum +i;
        }
        return sum;
    }

    private static int sumOfUsingRecursion(int n) {
        if (n == 1) return 1;
        return sumOfUsingRecursion(n-1) +n;
    }
 }
