import java.util.Scanner;

public class SquareNonDecreasingOrder {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reverse (int[] ans){

        for (int i = ans.length-1; i >= 0 ; i--) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    static int[] sortSquare(int[] arr){

        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];
        int k = 0;

        while (left <= right){
            if(Math.abs(arr[left]) >  Math.abs(arr[right])){
                ans[k] = arr[left] * arr[left];
                k++;
                left++;
            }
            else{
                ans[k] = arr[right] * arr[right];
                right--;
                k++;
            }

        }
                return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        Printing original Array
        System.out.println("Original Array ");
        printArray(arr);

//        printing sorted Array
        System.out.println("Sorted Array in non decresing order after squaring it");
        int ans[] = sortSquare(arr);
        reverse(ans);
    }


}
