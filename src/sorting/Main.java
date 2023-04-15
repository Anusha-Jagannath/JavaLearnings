package sorting;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning bubble sort");
        int arr[] = {1, 2, 3, 2, 5, 1};
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
               swapped = false;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
