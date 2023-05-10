package twopointeralgorithm;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        System.out.print("Learning two pointer algorithm");

        int arr[] = {1, 2, -2, 1, 4, 5};
        int n = arr.length;
        Arrays.sort(arr);
        boolean isFound = false;

        for (int i = 0; i < n - 2; i++) {
            if (findTriplets1(arr, i + 1, n, -arr[i])) {
                isFound = true;
                break;
            }
        }
        System.out.print(isFound);

    }

    private static boolean findTriplets(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean isFound = false;
            for (int j = i + 1; j < n; j++) {
                for (int k = i + 2; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean findTriplets1(int arr[], int i, int n, int sum) {
        Arrays.sort(arr);
        //int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] + arr[j] < sum) {
                i++;
            } else if (arr[i] + arr[j] > sum) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
