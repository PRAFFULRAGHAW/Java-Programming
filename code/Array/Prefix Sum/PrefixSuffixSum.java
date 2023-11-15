// Check if we partition the array into two sub-array with equal sum.
// More formally check that the prefix sum of a part of an array is equal to
// the suffix sum of rest array or not

import java.util.Scanner;

public class PrefixSuffixSum {

    static int findArraySum(int[] arr){
        int total_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            total_sum += arr[i];
        }
        return total_sum;
    }
    static boolean equalSumPartition(int[] arr){

        int totalSum = findArraySum(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if(prefixSum == suffixSum){
                return true;
            }
        }



            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Possible value of partition is : " + equalSumPartition(arr));

    }
}
