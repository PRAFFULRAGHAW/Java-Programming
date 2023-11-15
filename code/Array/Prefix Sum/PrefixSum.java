import java.util.Scanner;

//Given an array a return the prefix sum/running sum in the same array without creating a new array
public class PrefixSum {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSum(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
//            if (i == 0){
//                arr[i] = arr[i];
//            }
//            else{
//                arr[i] = arr[i] + arr[i-1];
//            }
            arr[i] = arr[i] + arr[i-1];
        }
        return(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array ");
        printArray(arr);

        System.out.println("Prefix Array ");
        int[] ans = makePrefixSum(arr);
        printArray(ans);
    }
}
