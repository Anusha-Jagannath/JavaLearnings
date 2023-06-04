package datastructurelearn;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {

    public static void main(String args[]) {
        System.out.println("Learning zero sum subarray problem");
        int arr[] = {1, 2, -3, 4, 5, 6};
        int n = arr.length;

        System.out.println(subArray(arr, n));

    }

    private static boolean subArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + arr[j];
                if (sum == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean subArray1(int arr[], int n) {
        Set<Integer> set = new HashSet<>();
        int sum =0;
        for (int ele: arr) {
            sum =sum+ele;
            if (set.contains(sum)) {
                return true;
            }
        }

        return false;
    }
}
