package twopointeralgo;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning two pointer algorithm");

        int arr[] = {2,4,1,3,4,0,3};
        int n = arr.length;
        for(int i=0;i<n-2;i++) {
            if(findTriplets(arr,n,i,-arr[i])) {
                System.out.print("true");
            }
        }

    }


    private static boolean findTwoSm(int arr[],int n,int x) {
        //sort the array
        Arrays.sort(arr);

        int i =0;
        int j = n;
        while (i < j) {
            if (arr[i] + arr[j] < x) i++;
            else if(arr[i] + arr[j] > x) j--;
            else {
                return true;
            }
        }

        return false;
    }

    private static boolean findTriplets(int arr[],int n,int i,int x) {
        //sort the array
        Arrays.sort(arr);

        //int i =0;
        int j = n-1;
        while (i < j) {
            if (arr[i] + arr[j] < x) i++;
            else if(arr[i] + arr[j] > x) j--;
            else {
                return true;
            }
        }

        return false;
    }
}
