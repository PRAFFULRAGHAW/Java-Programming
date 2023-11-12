import java.util.Arrays;
import java.util.Scanner;

// find the first, second smallest value using array manipulation
public class SecondSmallestElementArrayManipulation {

    public static int firstSmallest(int[] arr){

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int secondSmallest(int[] arr){

        int min = firstSmallest(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }

        }
        return firstSmallest(arr);
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

        System.out.println("First Maximum Value is " + firstSmallest(arr));
        System.out.println("Second Maximum value is " + secondSmallest(arr));
    }


}

