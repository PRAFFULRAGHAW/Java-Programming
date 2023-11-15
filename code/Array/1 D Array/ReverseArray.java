import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int[] arr){

        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
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

        reverse(arr);

    }
}
