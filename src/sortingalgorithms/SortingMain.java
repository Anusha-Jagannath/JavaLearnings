package sortingalgorithms;

public class SortingMain {

    public static void main(String args[]) {
        System.out.print("Learning bubble sort");
        int arr[] = {2, 1, 4, 3, 6, 2, 9};
        int n = arr.length;
        boolean sorted = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                sorted = false;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = true;
                }
            }

            if (sorted) break;
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
