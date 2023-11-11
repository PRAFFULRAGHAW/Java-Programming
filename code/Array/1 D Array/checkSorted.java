import java.util.Scanner;

public class checkSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter size of array");
        int n = sc.nextInt() ;
        int[] arr = new int[n];
        boolean check = true;

        System.out.println("please enter the elements  of array to check weather it is sorted or not");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                check = false;
                break;
            }
        }

        if(check){
            System.out.println("Given array is sorted");
        }
        else{
            System.out.println("Given array is not sorted");
        }
    }
}
