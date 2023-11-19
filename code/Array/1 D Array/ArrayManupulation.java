// find unique number in a given array where all elements are repeated by twice with one unique value
import java.util.Scanner;

public class ArrayManupulation {

    static int findUnique(int[] arr){
        int n = arr.length;
        int res = -1;

        for(int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }

            }
            }
          for(int i = 0; i < n; i++){
            if( arr[i] != -1){
                res = arr[i];
            }

        }
        return res ;

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

        System.out.println("value which is unique in given array is "+findUnique(arr));
    }

}
