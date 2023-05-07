package singletonpattern;

import java.util.Arrays;

public class TwoPointerAlgorithm {

    public static void main(String args[]) {
        System.out.println("Learning two pointer algorithm");
        //find triplets with sum 0
        int arr[] = {1, 2, 3, -5};
        //System.out.print(findTriplets(arr, arr.length));
        findTriplets1(arr,arr.length,0);

    }


    private static boolean findTriplets(int arr[], int n) {

        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            isFound = false;
            for (int j = i + 1; j < n; j++) {
                for (int k = i + 2; k < n; k++) {
                    sum += arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean findTriplets1(int arr[],int n,int x) {
        Arrays.sort(arr);
        int i=0;
        int j = n;

        while (i<j) {
            if (arr[i]+arr[j] < x) i--;

           else if (arr[i]+arr[j] > x) j++;

           else return true;
        }
        return false;
    }
}
