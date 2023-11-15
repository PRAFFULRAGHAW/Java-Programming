//write a program to find prefix sum for q queries taking the range from users

import java.util.Scanner;

public class PrefixSumQQueries {

    static void printArray(int[] arr){
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] prefixArray(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        return (arr);

    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter " + n + " elements of array");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of queries");
        int q = sc.nextInt();

        int[] prefix = prefixArray(arr);

        while(q > 0){
            System.out.println("Enter the value of left and right index");
            int l = sc.nextInt();
            int r =  sc.nextInt();
            int ans = prefix[r] - prefix[l - 1 ];

            System.out.println("prefix sum from range " + l + " to " + r + " is " + ans);


            q--;
        }
    }

}