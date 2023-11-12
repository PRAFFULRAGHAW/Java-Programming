// find the second largest value using array manipulation
import java.util.Scanner;

public class SecondLargestElement {
    static int firstMaximum(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int secondMaximum(int[] arr) {

        int max = firstMaximum(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] =  Integer.MIN_VALUE;
            }
        }


        return max = firstMaximum(arr);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " +n + " Elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("First Maximum Value is " + firstMaximum(arr));
        System.out.println("Second Maximum value is " + secondMaximum(arr));
    }

}



