package twopointeralgor;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        System.out.print("Learning two pointer algorithm");
        int arr[] = {-1, 2, -1, 2, 3};
        int n = arr.length;
        //System.out.print(findTwoSum(arr,n));
        //System.out.print(findTriplets(arr,n,0));

        boolean isFound = false;

        for (int i=0;i<n-2;i++) {
            if (findTriplets1(arr, i + 1, n - 1, -arr[i])) {
                isFound = true;
                break;
            }
        }

        System.out.print(isFound);

    }

    private static boolean findTwoSum(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

   /* private static boolean findTriplets(int arr[],int n, int sum) {

        int i=0;
        int j = n-1;

        Arrays.sort(arr);

        while (i < j) {
            if (arr[i] + arr[j] < sum) i++;

            else if (arr[i] + arr[j] > sum) j--;

            else return true;
        }

        return false;
    } */

    private static boolean findTriplets1(int arr[],int i,int j, int sum) {

        //int i=0;
        //int j = n-1;

        Arrays.sort(arr);

        while (i < j) {
            if (arr[i] + arr[j] < sum) i++;

            else if (arr[i] + arr[j] > sum) j--;

            else return true;
        }

        return false;
    }
}
