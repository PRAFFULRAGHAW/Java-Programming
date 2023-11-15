// Sort an array consisting of only 0s and 1s
import java.util.Scanner;


public class SortArray01 {

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

    static void sortZerosAndOnes(int[] arr){
        int count = 0;

//        Count number of zeros
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count++;
            }
        }

//         0 to count - 1 : 0, zeros to n - 1 : 1
        for (int i = 0; i < arr.length; i++) {
            if (i < count){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
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
        sortZerosAndOnes(arr);


    }
}