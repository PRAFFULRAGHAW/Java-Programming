// we have a given array now we have to find the first array value that is repeated
// if the value is repeated then return the value else return -1

import java.util.Scanner;

public class RepeatingValue {

    public static int firstRepeated(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    return  arr[i];
                }
            }
        }
    return -1;

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

        System.out.println("First Repeated value is " + firstRepeated(arr));

    }
}
