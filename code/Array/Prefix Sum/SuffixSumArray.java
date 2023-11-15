import java.util.Scanner;

public class SuffixSumArray {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void suffixSum(int[] arr){

        int n = arr.length;

        for (int i = n - 2; i >= 0 ; i--) {
            arr[i] = arr[i] + arr[i + 1];
        }
        printArray(arr);
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
        suffixSum(arr);


    }
}
