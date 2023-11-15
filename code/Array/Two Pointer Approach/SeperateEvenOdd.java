// Given an array of integer 'a' move all the even integer at beginning
// of the array followed by all odd integer
// NOte the relative order does not matter
import java.util.Scanner;

public class SeperateEvenOdd {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortEvenOdd(int[] arr){

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right){

            if((arr[left] % 2 != 0) && (arr[right] % 2 == 0) ){
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] % 2 == 0){
                left++;
            }

            if (arr[right] % 2 != 0){
                right--;
            }

        }

        printArray(arr);
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
        System.out.println("Sorted Array is ");
        sortEvenOdd(arr);


    }
}
