import java.util.Arrays;
import java.util.Scanner;

class sorting{

    void smallestLargest(int[] arr, int n){
        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            if(i == 0 || i == arr.length-1) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}

public class smallestLargest {
    public static void main(String[] args) {

        sorting obj = new sorting();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter elements of array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        obj.smallestLargest(arr, n);



    }
}
