package sorting;

public class SelectionSort {

    public static void main(String args[]) {
        System.out.println("Learning selection sort");

        int arr[] = {2, 1, 3, 1, 12, 4,};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
