package sortingalgorithms;

public class SelectionMain {

    public static void main(String args[]) {
        System.out.print("Learning selection sort");

        int a[] = {2,1,3,4,2,1};
        int n = a.length;

        for(int i=0;i<n-1;i++) {
            int min = i;

            for(int j=i+1;j<n;j++) {
                if (a[j] <a[min]) {
                    min = j;
                }
            }

            if (i != min) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }

        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
