import java.util.Scanner;

public class ArrayRotationByKTimes {

    static void arrayPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        int rotation = k;
        k = k % n;
        int j = 0;
        int[] ans = new int[n];

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];

        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

//        System.out.println("After rotating array by " + rotation + " Times" );
//
//        for (int i = 0; i < n ; i++) {
//            System.out.print(ans[i] + " ");
//        }

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

        System.out.println("Enter value of k ");
        int k = sc.nextInt();

        System.out.println("Original array ");
        arrayPrint(arr);
        int[] ans = rotate(arr,k);

        System.out.println("\nArray after " + k + " Rotation");
        arrayPrint(ans);

//


    }
}
